import java.io.*;
import java.net.*;
class Ftpclient
{
public static void main(String args[])throws IOException
{
Socket s=new Socket(InetAddress.getLocalHost(),5555);
DataInputStream s1=new DataInputStream(s.getInputStream());
DataInputStream inp=new DataInputStream(System.in);
DataOutputStream so=new DataOutputStream(s.getOutputStream());
System.out.println("TcpClient1.java");
String str=inp.readLine();
so.writeBytes(str);
so.writeBytes("\n");
FileOutputStream fos=new FileOutputStream("Tejodeepoutput.txt");
int str1;
while((str1=s1.read())!=-1)
fos.write((char)str1);
System.out.println("\n file received successfully");
s1.close();
so.close();
inp.close();
s.close();
}
}