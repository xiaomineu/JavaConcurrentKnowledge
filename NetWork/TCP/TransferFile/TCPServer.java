package NetWork.TCP.TransferFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 步骤：
 *  1.创建Server对象，获取使用固定端口的Socket对象
 *  2.使用Socket获取网络字节输入流对象
 *  3.创建本地字节输出流对象（构造方法中指定文件）
 *  4.使用网络字节输出流的Input方法，输入文件字节流
 *  5.使用本地字节输出流对象的write方法，输出字节流
 *
 *  6.使用Socket获取网络字节输出流对象
 *  7.使用网络字节输出流的write方法，返回字节流信息给客户端
 *
 *  8.释放资源
 */

public class TCPServer {
    public static void main(String[] args)throws IOException {

        ServerSocket serverSocket=new ServerSocket(8888);

        Socket socket=serverSocket.accept();

        InputStream inputStream=socket.getInputStream();

        FileOutputStream fileOutputStream=new FileOutputStream("E:\\Java_file\\untitled\\src\\IO\\test\\accept.png");

        byte[] bytes=new byte[1024];

        int len=0;

        while((len=inputStream.read(bytes))!=-1)
        {
            fileOutputStream.write(bytes,0,len);
        }

        OutputStream outputStream=socket.getOutputStream();

        outputStream.write("上传成功".getBytes());

        fileOutputStream.close();
        socket.close();
        serverSocket.close();

    }
}
