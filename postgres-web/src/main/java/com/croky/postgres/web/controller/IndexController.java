package com.croky.postgres.web.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.croky.common.util.CollectionUtils;
//import com.croky.microware.bdsc.client.BdscServiceClient;
//import com.croky.microware.bdsc.client.model.UnifiedClassifyElementVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.croky.common.lang.Result;
import com.croky.common.servlet.model.LoginUser;
import com.croky.common.servlet.util.RequestUtils;
import com.croky.common.util.StringUtils;
import com.croky.postgres.utils.Constants;
@Configuration
@PropertySource("classpath:application.properties")
@RefreshScope
@Controller
public class IndexController {
	@Value("${app.upload.path}")
	private String uploadPath;
	
	@Value("${app.id}")
	private int appId;

//	@Resource
//	private BdscServiceClient bdscServiceClient;

	@Resource
	RestTemplate restTemplate;

	@Resource
	private LoadBalancerClient loadBalancerClient;

	@RequestMapping(value="/",method = RequestMethod.GET)
	@ResponseBody 
	public String index(HttpServletRequest request,HttpServletResponse response) {
		return Constants.WELCOME;
	}

	@GetMapping(value="/home.html")
	public ModelAndView home(Model model,HttpServletRequest request,HttpServletResponse response) {
		LoginUser loginUser = RequestUtils.getLoginUser();
		if (null == loginUser) {
			loginUser = new LoginUser();
			loginUser.setAccount("test1234");
			loginUser.setNick("<font color='red'>Constants.WELCOME</font>");
			loginUser.setId(appId);
			loginUser.setTmp(true);
		} else {
			loginUser.setAccount(appId + " - " + loginUser.getAccount());
			loginUser.setNick("<font color='red'>" + "hello " + loginUser.getNick() + "</font>");
		}
		loginUser.setExpire(Integer.MAX_VALUE);
		return new ModelAndView("home","user",loginUser);//home + spring.thymeleaf.suffix = template.name
	}

	 @Operation(summary = "用户登录", description = "用户输入用户名,密码,或者验证码登录")
	 @Parameters({
		 @Parameter(name = "name", description = "用户名", required = true),
		 @Parameter(name = "password", description = "用户密码", required = true),
		 @Parameter(name = "verCode", description = "验证码", required = false)
	 })
	@RequestMapping(value="/login",method = RequestMethod.GET)
	@ResponseBody 
	public Result<String> login(@RequestParam String name,@RequestParam String password,@RequestParam(required = false) String verCode) {
		 if (null != RequestUtils.currentSecurityAuthorized) {
			 LoginUser loginUser = new LoginUser();
			 try {
				RequestUtils.currentSecurityAuthorized.login(loginUser);
			} catch (Exception e) {
				 return Result.normal("登陆失败:" + e.getMessage());
			}
			 return Result.normal("登录成功");
		 }
		 return Result.error("没有设置登录安全验证class");
	}

	@Operation(summary = "获取登录用户信息", description = "获取登录用户信息")
	@RequestMapping(value="/getLoginUser",method = RequestMethod.GET)
	@ResponseBody 
	public Result<LoginUser> getLoginUser() {
		 return Result.normal(RequestUtils.getLoginUser());
	}
	


	@Operation(summary = "上传文件，将内容转为base64编码", description = "上传文件,需要用@ApiParam注解,swagger能正常解析")
	//paramType = {path,query,body,header,form}
	@Parameter(name = "uploadFiles", description = "上传文件", style = ParameterStyle.FORM, required = true)
	@PostMapping(value=("/base64"), consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Result<String> base64(@RequestPart List<MultipartFile> uploadFiles/*单个文件上传可以这样注入*/) {
	//@ApiParam(value = "__file", type = "form", allowMultiple = true, required = true)
		if (CollectionUtils.isNotEmpty(uploadFiles)) {
			try {
				return Result.normal(StringUtils.base64Encoding(uploadFiles.get(0).getBytes()));
			} catch (IOException e) {
				return Result.error(e.getMessage());
			}
		}
		return Result.error("not file upload");
	}

	/*
	@Operation(summary = "通过openfeign获取应用的统一分类体系元素")
	@PostMapping(value=("/getUnifyClassElements"))
	@ResponseBody
	public Result<List<UnifiedClassifyElementVO>> getUnifyClassElements() {
		return bdscServiceClient.getClassifyElements(8,0);
	}

	@Operation(summary = "通过模板获取应用的统一分类体系元素")
	@PostMapping(value=("/getUnifyClassElements2"))
	@ResponseBody
	public Result<List<UnifiedClassifyElementVO>> getUnifyClassElements2() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("bdsc");
		String url = String.format("https://%s:%s",serviceInstance.getHost(),serviceInstance.getPort());
		//https其实对于ip不友好
		url = "https://www.yaofanbao.com:" + serviceInstance.getPort() + "/getClassifyElements?bizBlockId={1}&parentId={2}";
		String responseString = restTemplate.getForObject(url, String.class,8,0);
		ParameterizedTypeReference<Result<List<UnifiedClassifyElementVO>>> reference = new ParameterizedTypeReference<Result<List<UnifiedClassifyElementVO>>>() {
		};
		ResponseEntity<Result<List<UnifiedClassifyElementVO>>> entity = restTemplate.exchange(url, HttpMethod.GET, null, reference,8,0);
		if (null != entity) {
			return entity.getBody();
		}
		return Result.normal();
	}
	*/

//	@GetMapping("/doc")
//	public String doc() {
//		return "forward:/swagger-ui/index.html";
//	}

	@Operation(summary = "重启服务，只在本地或在dev环境下有效")
	@PostMapping("/restart")
	public String restart() {
		return "forward:/actuator/restart";
	}

	@Operation(summary = "暂停服务，只在本地或在dev环境下有效")
	@PostMapping("/pause")
	public String pause() {
		return "forward:/actuator/pause";
	}

	@Operation(summary = "关闭服务，只在本地或在dev环境下有效")
	@PostMapping("/shutdown")
	public String shutdown() {
		return "forward:/actuator/shutdown";
	}
}
