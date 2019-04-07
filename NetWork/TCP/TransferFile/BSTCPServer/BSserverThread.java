package NetWork.TCP.TransferFile.BSTCPServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建BS版本TCP服务器
 */

public class BSserver {
    public static void main(String[] args) throws IOException {
        //创建一个服务器
        ServerSocket serverSocket = new ServerSocket(8080);
        //使用accept方法，获取socket对象
        Socket socket = serverSocket.accept();
        //使用socket对象获取网络输入流
        InputStream inputStream = socket.getInputStream();

        //将网络字节输入流对象，转换为字符缓冲输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        //读取客户端请求信息的第一行
        String line = bufferedReader.readLine();// GET /untitled/src/NetWork/web/index.html HTTP/1.1

        //拆分请求信息，只要中间部分//untitled/src/NetWork/web/index.html
        String[] arr = line.split(" ");

        //将路径前//去掉，进行截取
        String htmlPath = arr[1].substring(1);

        //创建本地字节输入流，构造方法中包含html路径
        FileInputStream fileInputStream = new FileInputStream(htmlPath);

        //获取Socket中的字节输出流
        OutputStream outputStream=socket.getOutputStream();

        //写入HTTP协议响应头，固定写法
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-Type:text/html\r\n".getBytes());
        //必须写入空行，否则浏览器不解析
        outputStream.write("\r\n".getBytes());

        //使用read方法，读取字节输入流,边读边写
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fileInputStream.read(bytes))!=-1)
        {
            outputStream.write(bytes);
        }

        fileInputStream.close();
        socket.close();
        serverSocket.close();
    }
}