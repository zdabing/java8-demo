package wzbsdb.io;

import java.io.*;

public class Output02 {
    public static void main(String[] args) throws IOException {
        try (OutputStream outputStream = new FileOutputStream("doc\\1.txt")) {
            byte[] b1 = "hello".getBytes("UTF-8");
            outputStream.write(b1);
            byte[] b2 = "我真不是大饼01".getBytes("UTF-8");
            outputStream.write(b2);
        }
    }
}
