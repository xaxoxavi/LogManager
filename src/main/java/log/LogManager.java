package log;

/**
 * Created by xavi on 17/10/17.
 */
public interface LogManager {

    void setInfo(boolean isInfo);

    void setError(boolean isError);

    void setWarning(boolean isWarning);

    void setDebug(boolean isDebug);


    void info(String text);

    void error(String text);

    void debug(String text);

    void warning(String text);

}
