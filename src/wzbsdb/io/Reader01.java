package wzbsdb.io;

import java.io.*;

/**
 * InputStream ： 是所有字节输入流的超类，一般使用它的子类：FileInputStream等，它能输出字节流；
 * InputStreamReader ： 是字节流与字符流之间的桥梁，能将字节流输出为字符流，并且能为字节流指定字符集，可输出一个个的字符；
 * BufferedReader ： 提供通用的缓冲方式文本读取，readLine读取一个文本行， 从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取。
 */
public class Reader01 {
    public static void main(String[] args) throws IOException {
        try  (Reader reader = new InputStreamReader(new FileInputStream("doc\\《雪中悍刀行》（校对版全本）作者：烽火戏诸侯.txt"),"GB2312")) {
            int n;
            //每一个子读取
            while ((n = reader.read()) != -1){
                System.out.println((char) n);
            }
        }
    }
}
