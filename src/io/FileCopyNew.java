package io;

import java.io.*;
import java.text.DecimalFormat;

/**
 * 文件复制类
 */
public class FileCopyNew {
    private static File input = new File("doc\\《雪中悍刀行》（校对版全本）作者：烽火戏诸侯.txt");
    private static File output = new File("doc\\《雪中悍刀行》（校对版全本）作者：烽火戏诸侯-复制.txt");

    public static void main(String[] args) throws IOException {
        try (FileInputStream is = new FileInputStream(input); FileOutputStream os = new FileOutputStream(output)) {
            byte[] b = new byte[1024 * 1024];
            int length = 0;
            //获取源文件大小
            long len = input.length();
            //已复制文件的字节数
            double temp = 0;
            //数字格式化，显示百分比
            DecimalFormat df = new DecimalFormat("##.00%");
            while((length = is.read(b))!=-1){
                //输出字节
                os.write(b, 0, length);
                //获取已下载的大小，并且转换成百分比
                temp += length;
                double d = temp/len;
                System.out.println(output.getName()+"已复制的进度：" + df.format(d));
            }
            System.out.println(output.getName()+"复制完成！");
        }
    }
}
