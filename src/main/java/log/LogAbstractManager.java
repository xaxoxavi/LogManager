package log;

/**
 * Created by xavi on 18/10/17.
 */
public abstract class LogAbstractManager implements LogManager{

    private boolean isInfo = true;
    private boolean isDebug = true;
    private boolean isError = true;
    private boolean isWarning = true;

    public void setInfo(boolean info) {
        isInfo = info;
    }

    public void setDebug(boolean debug) {
        isDebug = debug;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public void setWarning(boolean warning) {
        isWarning = warning;
    }


    public boolean isInfo() {
        return isInfo;
    }

    public boolean isDebug() {
        return isDebug;
    }

    public boolean isError() {
        return isError;
    }

    public boolean isWarning() {
        return isWarning;
    }
}
