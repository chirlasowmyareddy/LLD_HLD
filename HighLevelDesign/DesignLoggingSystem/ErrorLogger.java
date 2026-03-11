package LLD_HLD.HighLevelDesign.DesignLoggingSystem;

public class ErrorLogger extends Logger{

    public ErrorLogger(){
        this.level = LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR "+ message);
    }
}
