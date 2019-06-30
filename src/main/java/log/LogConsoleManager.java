package log;

/**
 * Created by xavi on 17/10/17.
 */
public class LogConsoleManager extends LogAbstractManager {

    LogConsoleManager(){}


    public void info(String text) {
        if (isInfo()) printLogWithLevel(LogLevel.INFO,text);

    }

    public void error(String text) {
        if (isError()) printLogWithLevel(LogLevel.ERROR,text);
    }

    public void debug(String text) {
        if (isDebug()) printLogWithLevel(LogLevel.DEBUG,text);

    }

    public void warning(String text) {
        if (isWarning()) printLogWithLevel(LogLevel.WARN, text);
    }

    private void printLogWithLevel(LogLevel level, String text) {
        System.out.println(level.toString() + ": " + text);
    }



}
