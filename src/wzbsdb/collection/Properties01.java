package wzbsdb.collection;

import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        //直接读取
        //properties.load(new FileInputStream("H:\\java8-demo\\src\\collection\\setting.properties"));
        properties.load(Properties01.class.getResourceAsStream("/wzbsdb/collection/setting.properties"));
        String url = properties.getProperty("url");
        //设置默认值 如果不存在的话
        String diver = properties.getProperty("diver","12132132132");
        String title = properties.getProperty("title");
        System.out.println(url + "->" + title + diver);
    }
}
