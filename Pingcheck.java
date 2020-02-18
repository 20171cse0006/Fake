import java.io.*;
import java.net.*;
class Pingcheck
{
public static void main(String args[])
{
BufferedReader in;
try
{
Runtime r=Runtime.getRuntime();
Process p=r.exec("ping 192.168.14.49");
if(p==null)
System.out.println("Could not connect");
in=new BufferedReader(new InputStreamReader(p.getInputStream()));
String line;
while((line=in.readLine())!=null)
{
if(line.startsWith("Reply"))
System.out.println("this is reply");
else if(line.startsWith("request"))
System.out.println("there is no reply");
else if(line.startsWith("destination"))
System.out.println("destination host unrechable");
else
System.out.println(line);
}
System.out.println(in.readLine());
in.close();
}
catch(IOException e)
{
System.out.println(e.toString());
}
}
}