package LLD_HLD.HighLevelDesign.DesignLoggingSystem;

public class InfoLogger extends Logger{

    public InfoLogger(){
        this.level = LogLevel.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO "+message);
    }
    
}
