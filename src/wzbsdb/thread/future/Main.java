package wzbsdb.thread.future;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.*;

class DownloadTask implements Callable<String> {
	String url;

	public DownloadTask(String url) {
		this.url = url;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Start download " + url + "...");
		URLConnection conn = new URL(this.url).openConnection();
		conn.connect();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"))) {
			String s = null;
			StringBuilder sb = new StringBuilder();
			while ((s = reader.readLine()) != null) {
				sb.append(s).append("\n");
			}
			return sb.toString();
		}
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		//线程池
		ExecutorService executor = Executors.newFixedThreadPool(5);
		DownloadTask task = new DownloadTask("http://www.sina.com.cn/");
		Future<String> future = executor.submit(task);
		String html = future.get();
		System.out.println(html);
		executor.shutdown();
	}
}
