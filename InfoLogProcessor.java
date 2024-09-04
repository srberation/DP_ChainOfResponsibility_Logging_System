package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int loglevel, String msg){
        if(loglevel == INFO_LOG){
            System.out.print("Info Log");
        }
        else {
            super.log(loglevel,msg);
        }
    }
}
