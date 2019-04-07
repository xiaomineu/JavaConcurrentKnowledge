package NetWork.TCP;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端：接收客户端请求，读取客户端发送数据，给客户端回写数据
 * 表示服务器的类：
 *      java.net.ServerSocket:此类实现服务器套接字
 *  Construct
 *      ServerSocket(int port)创建绑定到特定端口的服务器套接字
 *  服务器必须知道是哪个客户端请求的服务器
 *      使用accept方法获取到请求的客户端对象Socket
 *  成员方法:
 *      Socket accept()监听并接受套接字的连接
 *
 *  服务器实现：
 *      1.创建服务器ServerSocket对象和系统指定的端口号
 *      2.使用ServerSocket对象中的方法accept()，获取到请求的客户端对象Socket
 *      3.使用Socket对象方法getInputStream()获取网络输入流InputStream对象
 *      4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送数据
 *      5.使用Socket对象方法getOutputStream()获取网络输出流OutputStream对象
 *      6.使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据
 */

public class DemoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);

        Socket socket=serverSocket.accept();

        InputStream inputStream=socket.getInputStream();

        byte[] bytes=new byte[1024];
        int len=inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("收到谢谢".getBytes());

        socket.close();
        serverSocket.close();
    }
}
