package log;

/**
 * Created by xavi on 18/10/17.
 */
public class LogManagerSingleton {

    private static LogManager instance;

    private LogManagerSingleton(){}

    private static synchronized void createInstance(){

        if (instance == null) instance = new LogConsoleManager();
    }

    public static LogManager getInstance(){
        if (instance == null ) createInstance();
        return instance;
    }

}
