import java.io.*;
import java.net.*;
class TcpClient1
{
public static void main(String args[]) throws IOException
{
Socket s=new Socket("192.168.14.92",55);
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
String str=in.readLine();
System.out.println("String from Tcp Server:"+str);
}
} 