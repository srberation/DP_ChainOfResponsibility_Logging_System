package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    public void log(int loglevel, String msg){
        if(loglevel == DEBUG_LOG){
            System.out.print("Debug Log");
        }
        else {
            super.log(loglevel,msg);
        }
    }
}
