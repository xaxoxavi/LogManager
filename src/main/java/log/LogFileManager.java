package log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by xavi on 17/10/17.
 */
public class LogFileManager extends LogAbstractManager {

    private String path;
    private final String fileName = "/log.out";

    public void init(){
        File file = new File(path + fileName);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void info(String text) {
        if (isInfo()) appendFile(text);

    }

    public void error(String text) {
        if (isError()) appendFile(text);

    }

    public void debug(String text) {
        if (isDebug()) appendFile(text);

    }

    public void warning(String text) {
        if (isWarning()) appendFile(text);

    }

    public void setPath(String path) {
        this.path = path;
    }

    private void appendFile(String toAppend){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter(path + fileName, true));
            writer.append(toAppend);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
