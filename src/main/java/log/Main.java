package log;

/**
 * Created by xavi on 20/10/17.
 */
public class Main
{

    public static void main(String[] args) {
        LogManager log = LogManagerSingleton.getInstance();

        log.info("prova!!");
        
    }

}
