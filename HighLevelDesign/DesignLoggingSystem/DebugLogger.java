package LLD_HLD.HighLevelDesign.DesignLoggingSystem;

public class DebugLogger extends Logger{

    public DebugLogger(){
        this.level = LogLevel.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG "+message);
    }
    
}
