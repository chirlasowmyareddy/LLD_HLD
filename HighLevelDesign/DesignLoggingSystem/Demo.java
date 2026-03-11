package LLD_HLD.HighLevelDesign.DesignLoggingSystem;

public class Demo {
    public static void main(String[] args){
        Logger logger  = LoggerChain.getLoggerChain();

        logger.logMessage(LogLevel.INFO,"This is info message");

        logger.logMessage(LogLevel.DEBUG,"This is debug message");

        logger.logMessage(LogLevel.ERROR,"This is error message");

        
    }
}
