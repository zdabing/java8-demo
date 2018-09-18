package io;

import java.io.*;

public class Input01 {
    public static void main(String[] args) throws IOException {
       try (InputStream inputStream = new FileInputStream("doc\\《雪中悍刀行》（校对版全本）作者：烽火戏诸侯.txt")) {
        int n;
        byte[] bytes = new byte[1024];
        while ((n = inputStream.read(bytes)) != -1){
            System.out.println(n);
        }
       }
       //以文本方式读取  使用缓存的
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("doc\\《雪中悍刀行》（校对版全本）作者：烽火戏诸侯.txt") , "GB2312"))) {
            String s = null;
            StringBuilder sb = new StringBuilder();
            // readLine读取一个文本行
            while ((s = reader.readLine()) != null) {
                System.out.println(sb.append(s).append("\n"));
            }
        }

    }
}
