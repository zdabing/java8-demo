package tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.StandardSocketOptions;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * TCP客户端
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //本地ip 127.0.0.1
        InetAddress address = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(address,9090)) {
            // 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8))) {
                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8))) {
                    writer.write("1231\n");
                    writer.flush();
                    String resp = reader.readLine();
                    System.out.println("resp:" + resp);
                }
            }
        }
    }
}
