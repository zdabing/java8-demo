package code;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String sss = "hello我真不是大饼";
        String encode = URLEncoder.encode(sss,"UTF-8");
        System.out.println(encode);
        System.out.println(URLDecoder.decode(encode,"UTF-8"));
    }
}
