package countwords;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by K_PC-S on 19.07.2017.
 */
public class OpenFile extends JFrame{
    File file;

    public OpenFile(){
        setBounds(0,0,500,500);
        JFileChooser dialog = new JFileChooser();
        dialog.setDialogType(JFileChooser.SAVE_DIALOG);

        dialog.setFileFilter(new myFileFilter(".txt","*.txt - text files"));
//        dialog.setFileFilter(FileFilter);
        dialog.showOpenDialog(this);
        file = dialog.getSelectedFile();
    }

    public File getFile() {
        return file;
    }

    public String getFileName(){
        return file.getName();

    }

    public String getDirectory(){
        return file.getParent();
    }



}
