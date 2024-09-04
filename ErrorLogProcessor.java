package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int loglevel, String msg){
        if(loglevel == ERROR_LOG){
            System.out.print("Error Log");
        }
        else {
            super.log(loglevel,msg);
        }
    }
}
