package log;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xavi on 20/10/17.
 */
public class Main
{

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");
        LogManager log = (LogManager) context.getBean("loggerFile");
        log.info("prova!!");
        
    }

}
