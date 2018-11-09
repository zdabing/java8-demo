package wzbsdb.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        // server将一直等待连接的到来
        System.out.println("server将一直等待连接的到来");
        Socket socket = ss.accept();
        // 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8))) {
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8))) {
                String cmd = reader.readLine();
                if ("wzbsdb/time".equals(cmd)) {
                    writer.write(LocalDateTime.now().toString()+ "\n");
                    //刷新输出流，使Server马上收到该字符串
                    writer.flush();
                }else {
                    writer.write("sorry?\n");
                    //刷新输出流，使Server马上收到该字符串
                    writer.flush();
                }
            }
        }
        socket.close();
        ss.close();
    }
}
