package wzbsdb.io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipSteam {
    public static void main(String[] args) throws IOException {
        try (ZipInputStream zip = new ZipInputStream(new BufferedInputStream(new FileInputStream("doc\\vhr-master.zip")))) {
            ZipEntry entry = null;
            while ((entry = zip.getNextEntry()) != null){
                if (entry.isDirectory()){
                    System.out.println("D " + entry.getName());
                }else {
                    System.out.println("F " + entry.getName() + entry.getSize());
                }
            }
        }
    }
    public void zip() throws IOException{
        try (OutputStream outputStream = new FileOutputStream("doc\\new.zip")) {
            byte[] b1 = "hello".getBytes("UTF-8");
            outputStream.write(b1);
            byte[] b2 = "我真不是大饼01".getBytes("UTF-8");
            outputStream.write(b2);
        }
    }
}
