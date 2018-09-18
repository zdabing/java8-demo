package io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) throws IOException {
        //windows 绝对路径
        File f1 = new File("H:\\java8-demo\\doc\\1.txt");
        //相对路径
        File f2 = new File("doc\\1.txt");
        File f3 = new File("H:\\java8-demo\\src\\annotation");
        String p0 = f2.getPath();
        String p1 = f2.getAbsolutePath();
        String p3 = f2.getCanonicalPath();
        //是否为文件
        System.out.println(f2.isFile());
        //是否为目录
        System.out.println(f3.isDirectory());
        String[] strings = f3.list();
        File[] files = f3.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        f3.mkdir();
        //可以创建不存在的目录
        f3.mkdirs();
        //linux
        File file1 = new File("/home/mysql/");
    }
}
