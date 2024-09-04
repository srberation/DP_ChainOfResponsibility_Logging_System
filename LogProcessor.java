package ChainOfResponsibility;

public abstract class LogProcessor {

    public static int INFO_LOG = 1;
    public static int ERROR_LOG = 2;
    public static int DEBUG_LOG= 3;

    LogProcessor nextlogProcessor;

    public LogProcessor(LogProcessor logProcessor){
        this.nextlogProcessor = logProcessor;
    }

    public void log(int logLevel, String msg){
        if(nextlogProcessor != null){
            nextlogProcessor.log(logLevel,msg);;
        }
    }

}
