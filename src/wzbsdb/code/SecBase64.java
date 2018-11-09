package wzbsdb.code;

import java.util.Base64;

public class SecBase64 {

	public static void main(String[] args) throws Exception {
		String original = "Hello1233编码测试算咯额不是不是么搞懂";
		String b64 = Base64.getUrlEncoder().withoutPadding().encodeToString(original.getBytes("UTF-8"));
		System.out.println(b64);
		String ori = new String(Base64.getUrlDecoder().decode(b64), "UTF-8");
		System.out.println(ori);
	}
}
