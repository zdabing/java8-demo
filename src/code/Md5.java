package code;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    public static byte[] toMd5(byte[] input){
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        messageDigest.update(input);
        return messageDigest.digest();
    }

    public static void main(String[] args) throws Exception {
        String s = "123456";
        byte[] bytes = toMd5(s.getBytes("UTF-8"));
        //16进制打印
        System.out.println(String.format("%032x",new BigInteger(1,bytes)));
    }
}
