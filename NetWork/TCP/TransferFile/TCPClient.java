package NetWork.TCP.TransferFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件上传案例
 *      客户端:读取本地文件，上传到服务器，读取服务器回写数据
 *
 *  步骤：
 *      1.创建一个本地字节输入流FileInputStream对象，读取本地文件信息
 *      2.创建Socket对象，构造方法中绑定IP与端口号
 *      3.使用Socket的getOutputStream获取网络字节输出流
 *      4.使用本地字节输入流FileInputStream的read方法，读取文件字节流
 *      5.使用网络字节输出流的write，输出文件字节流
 *      6.使用Socket的getInoutStream,获取网络字节输入流
 *      7.使用网络字节输入流，获取服务器返回数据
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("E:\\Java_file\\untitled\\src\\IO\\test\\l.png");

        Socket socket=new Socket("127.0.0.1",8888);

        OutputStream outputStream=socket.getOutputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fileInputStream.read(bytes))!=-1)
        {
            outputStream.write(bytes,0,len);
        }


        /**
         * 上传完文件，给服务器一个结束标记
         * void shutdownOutput()禁用此套接字的输出流
         * 对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP正常连接终止序列
         */
        socket.shutdownOutput();

        InputStream inputStream=socket.getInputStream();

        while((len=inputStream.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));
        }


        //释放资源
        fileInputStream.close();
        socket.close();
    }
}
