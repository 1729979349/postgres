package com.croky.postgres.handler;

import com.croky.common.servlet.util.RequestUtils;
import com.croky.common.util.ByteUtils;
import com.croky.common.util.StringUtils;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.socket.*;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.*;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;

/**
 * @author Croky
 * @Date 2022/8/23 13:50
 */
//@ServerEndpoint("/websocket")
@Service(value="testWebSocketHandler")
public class TestWebSocketHandler extends AbstractWebSocketHandler {
    private static final Logger log = LoggerFactory.getLogger(TestWebSocketHandler.class);
    //private static ConcurrentHashMap<LoginUser,WebSocketSession> webSocketMap = new ConcurrentHashMap<>();

    private BiMap<String,WebSocketSession> webSocketMap = Maps.synchronizedBiMap(HashBiMap.create());
    //定义全局变量用于保存所有用户的会话

    @OnOpen
    public void onOpen(Session session, HttpServletRequest request, @RequestParam("user") String user) {
//        log.debug("sessionID:" + session.getId() + " connection websocket server.");
//        RemoteEndpoint.Async async = session.getAsyncRemote();
//        InetSocketAddress addr = (InetSocketAddress) getFieldInstance(async,"base#socketWrapper#socket#sc#remoteAddress");
//        log.debug("IP:" + ByteUtils.toIpAddress(addr.getAddress().getAddress()) + " connection websocket server " + NetUtils.getLocalIP());
//        webSocketMap.put(user,session);
    }
    @OnClose
    public void onClose() {

    }
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误");
        error.printStackTrace();
    }

    @OnMessage
    public void onMessage(String message, Session session) {

    }
    //---------------------- 上面几个空方法不能注释或者删除，否则会导致tomcat pojoMethodMapping报错 -----------
    /**
     * webSocket连接创建后调用
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        log.debug("sessionID:" + session.getId() + " connection websocket server.");
        log.debug("IP:" + session.getRemoteAddress() + " connection websocket server " + ByteUtils.toIpAddress(session.getLocalAddress().getAddress().getAddress()));
        //LoginUser loginUser = RequestUtils.getLoginUser();//无法获取登录用户,就算允许匿名都没用
        //log.debug("user:" + ((null != loginUser) ? loginUser.getAccount() : "null") + " connection websocket server.");
        String user = (String)session.getAttributes().get("user");
        webSocketMap.put(user,session);
    }

    /**
     * 接收到消息会调用
     */
    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        //LoginUser loginUser = webSocketMap.inverse().get(session);
        String user = webSocketMap.inverse().get(session);
        log.debug("receive message from user:" + ((null != user) ? user : "null") + " message");
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)message;
            log.debug("message content:" + textMessage.getPayload());
        } else if (message instanceof BinaryMessage) {
            BinaryMessage binaryMessage = (BinaryMessage)message;
            log.debug("message content:" + StringUtils.toHexSmall(binaryMessage.getPayload().array()));
        } else {
            if (!(message instanceof PongMessage)) {
                throw new IllegalStateException("Unexpected WebSocket message type: " + message);
            }
            PongMessage pongMessage = (PongMessage)message;
            log.debug("message content:" + StringUtils.toHexSmall(pongMessage.getPayload().array()));
        }
    }

    /**
     * 连接出错会调用
     */
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) {
        //LoginUser loginUser = webSocketMap.inverse().get(session);
        String user = webSocketMap.inverse().get(session);
        log.error("websocket failed! user:" + ((null != user) ? user : "null") + " message:" + exception.getMessage());
        if (null != user) {
            webSocketMap.remove(user);
        }
    }

    /**
     * 连接关闭会调用
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        //LoginUser loginUser = webSocketMap.inverse().get(session);
        String user = webSocketMap.inverse().get(session);
        log.info("websocket connection closed! user:" + ((null != user) ? user : "null"));
        if (null != user) {
            webSocketMap.remove(user);
        }
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    /**
     * 封装方法发送消息到客户端
     */
    public void sendMessage(String message){
        WebSocketSession session = webSocketMap.get(RequestUtils.getLoginUser());
        if(null == session) {
            throw new RuntimeException("user not connection websocket");
        }
    }

    /*
     * 通过 websocket 的 session 来获取远程客户端的 IP
     */
    public static InetSocketAddress getRemoteAddress(Session session) {
        if (session == null) {
            return null;
        }
        RemoteEndpoint.Async async = session.getAsyncRemote();

        InetSocketAddress addr = (InetSocketAddress) getFieldInstance(async,"base#socketWrapper#socket#sc#remoteAddress");
        return addr;
    }

    private static Object getFieldInstance(Object obj, String fieldPath) {
        String fields[] = fieldPath.split("#");
        for (String field : fields) {
            obj = getField(obj, obj.getClass(), field);
            if (obj == null) {
                return null;
            }
        }

        return obj;
    }

    private static Object getField(Object obj, Class<?> clazz, String fieldName) {
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                Field field;
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field.get(obj);
            } catch (Exception e) {
            }
        }

        return null;
    }
}
