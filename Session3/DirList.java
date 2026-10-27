package Session3;
import java.io.*;

class FileFilter implements FilenameFilter {
    String ext;

    public FileFilter(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String fName) {
        return fName.endsWith(ext);
    }
}

public class DirList {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\DELL\\Desktop\\JavaFX\\Session3";
        File fileObj = new File("C:\\Users\\DELL\\Desktop\\JavaFX\\Session3");
        FilenameFilter filterObj = new FileFilter("java");
        String[] fileName = fileObj.list(filterObj);
        System.out.println("Number of files found : " + fileName.length);
        System.out.println("");
        System.out.println("Names of the files are : ");
        System.out.println(" ");
        for (int ctr = 0; ctr < fileName.length; ctr++) {
            System.out.println(fileName[ctr]);
        }
    }
}