#!/bin/bash
APP_PATH=/opt/apps/
APP_HOME=`pwd`
JAVA_HOME=/opt/jdk/jdk17/bin
COMMAND=$1
APP_NAME=$2
DEBUG_OPTS=$3
DEBUGPORT=8787
LOG_PATH=/opt/logs
# Memory configuration
JAVA_OPTS=-server
JAVA_OPTS="$JAVA_OPTS -Dfile.encoding=UTF8"
JAVA_OPTS="$JAVA_OPTS -Duser.timezone=Asia/Shanghai"
JAVA_OPTS="$JAVA_OPTS -Xms256m"
JAVA_OPTS="$JAVA_OPTS -Xmx2048m"
JAVA_OPTS="$JAVA_OPTS -XX:NewSize=128m"
JAVA_OPTS="$JAVA_OPTS -XX:MaxNewSize=1024m"
#JAVA_OPTS="$JAVA_OPTS -XX:PermSize=64m"
#JAVA_OPTS="$JAVA_OPTS -XX:MaxPermSize=256m"
#JAVA_OPTS="$JAVA_OPTS -XX:NewRatio=4"
#JAVA_OPTS="$JAVA_OPTS -XX:SurvivorRatio=5"
#JAVA_OPTS="$JAVA_OPTS -XX:LargePageSizeInBytes=128m"
#JAVA_OPTS="$JAVA_OPTS -XX:PretenureSizeThreshold=0"
#JAVA_OPTS="$JAVA_OPTS -XX:TLABWasteTargetPercent=1%"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseSerialGC"
#JAVA_OPTS="$JAVA_OPTS -XX:MaxTenuringThreshold=12"
#JAVA_OPTS="$JAVA_OPTS -XX:TargetSurvivorRatio=90"

#JAVA_OPTS="$JAVA_OPTS -XX:+UseParallelGC"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseParallelOldGC"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseParNewGC"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseAdaptiveSizePolicy"
#JAVA_OPTS="$JAVA_OPTS -XX:GCTimeRatio=49"

#JAVA_OPTS="$JAVA_OPTS -XX:+UseConcMarkSweepGC"
#JAVA_OPTS="$JAVA_OPTS -XX:+CMSIncrementalMode"
#JAVA_OPTS="$JAVA_OPTS -XX:+CMSIncrementalPacing"
#JAVA_OPTS="$JAVA_OPTS -XX:+CMSParallelRemarkEnabled"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseCMSCompactAtFullCollection"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseCMSInitiatingOccupancyOnly"
#JAVA_OPTS="$JAVA_OPTS -XX:CMSInitiatingOccupancyFraction=70"
#JAVA_OPTS="$JAVA_OPTS -XX:CMSInitiatingPermOccupancyFraction=92"
JAVA_OPTS="$JAVA_OPTS -XX:+UseG1GC"

JAVA_OPTS="$JAVA_OPTS -XX:MaxGCPauseMillis=200"
#JAVA_OPTS="$JAVA_OPTS -XX:+DisableExplicitGC"
#JAVA_OPTS="$JAVA_OPTS -XX:+CollectGen0First"
#JAVA_OPTS="$JAVA_OPTS -XX:+PrintGCDateStamps"
#JAVA_OPTS="$JAVA_OPTS -XX:+PrintGCDetails"

#JAVA_OPTS="$JAVA_OPTS -XX:+AggressiveOpts"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseBiasedLocking"
#JAVA_OPTS="$JAVA_OPTS -XX:BiasedLockingStartupDelay=4"
#JAVA_OPTS="$JAVA_OPTS -XX:-UseBiasedLocking"
#JAVA_OPTS="$JAVA_OPTS -Xnoclassgc"
#JAVA_OPTS="$JAVA_OPTS -XX:SoftRefLRUPolicyMSPerMB=0"
#JAVA_OPTS="$JAVA_OPTS -XX:+UseFastAccessorMethods"
JAVA_OPTS="$JAVA_OPTS -XX:+HeapDumpOnOutOfMemoryError"
JAVA_OPTS="$JAVA_OPTS -XX:HeapDumpPath=$LOG_PATH/$APP_NAME/outmemory_error.log"
JAVA_OPTS="$JAVA_OPTS -XX:ErrorFile=$LOG_PATH/$APP_NAME/error.log"
#JAVA_OPTS="$JAVA_OPTS -XXOnOutOfMemoryError=$APP_PATH/$APP_NAME start"
#JAVA_OPTS="$JAVA_OPTS -XXOnOutOfMemoryError=jmap -dump:format=b,file=./heap.bin"

function start()
{
    count=`ps -ef |grep java|grep $APP_NAME|grep -v grep|wc -l`
    if [ $count != 0 ];then
        echo "$APP_NAME is running..."
    else
                expr $COMMAND "+" 10 &> /dev/null
                #if [ $? -eq 0 ];then
                #        echo ""
                #else
                #        DEBUGPORT = 8787
                #fi
                if [ $DEBUG_OPTS = "-debug" ];then
                        JAVA_OPTS="$JAVA_OPTS -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=$DEBUGPORT"
                fi
        echo "nohup ${JAVA_HOME}/java $JAVA_OPTS -jar ${APP_NAME}.jar > /dev/null 2>&1 &"
        nohup ${JAVA_HOME}/java $JAVA_OPTS -jar ${APP_NAME}.jar > /dev/null 2>&1 &
                echo "start successed..."
    fi
}

function stop()
{
    count=`ps -ef |grep java|grep $APP_NAME|grep -v grep|wc -l`

    if [ $count != 0 ];then
        kill $boot_id
        count=`ps -ef |grep java|grep $APP_NAME|grep -v grep|wc -l`

        boot_id=`ps -ef |grep java|grep $APP_NAME|grep -v grep|awk '{print $0}'`
        kill -9 $boot_id
    fi
}

function restart()
{
    stop
    sleep 2
    start
}

function status()
{
    count=`ps -ef |grep java|grep $APP_NAME|grep -v grep|wc -l`
    if [ $count != 0 ];then
        echo "$APP_NAME is running..."
    else
        echo "$APP_NAME is not running..."
    fi
}

case $COMMAND in
    start)
    start;;
    stop)
    stop;;
    restart)
    restart;;
    status)
    status;;
    *)

echo -e "\033[0;31m Usage: \033[0m  \033[0;34m sh  $0  {start|stop|restart|status}  {SpringBootJarName} \033[0m\033[0;31m Example: \033[0m\033[0;33m ./ start ${APP_NAME} -debug [port]\033[0m"
esac