package LLD_HLD.HighLevelDesign.DesignLoggingSystem;

public class LoggerChain {

    public static Logger getLoggerChain(){
        Logger infoLogger  = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger  = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
