package countwords;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by K_PC-S on 20.07.2017.
 */
public class myFileFilter extends FileFilter {
    String ext,description;

public myFileFilter(String ext,String description){
    this.ext = ext;
    this.description = description;
}

    @Override
    public boolean accept(File f) {
       if(f!= null) {
           if (f.isDirectory()) {
               return true;
           }
           return f.toString().endsWith(ext);
       }
       return false;
       }


    @Override
    public String getDescription() {
        return description;
    }
}
