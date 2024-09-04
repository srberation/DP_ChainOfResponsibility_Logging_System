package ChainOfResponsibility;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR_LOG,"Error log process");
        logProcessor.log(LogProcessor.INFO_LOG, "Set it to info");
        logProcessor.log(LogProcessor.DEBUG_LOG, "Set it to debug");
    }


}


