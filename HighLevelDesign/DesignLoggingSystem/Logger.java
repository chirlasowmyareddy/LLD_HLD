package LLD_HLD.HighLevelDesign.DesignLoggingSystem;

public abstract class Logger {
    
    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if(this.level == level){
            write(message);
        }else if(nextLogger!=null){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
