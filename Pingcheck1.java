
import java.io.*;
import java.net.*;
class Pingcheck1
{
public static void main(String args[])
{
BufferedReader in;
try
{
Runtime r=Runtime.getRuntime();
Process p=r.exec("ping tejodeep.com");
if(p==null)
System.out.println("Could not connect");
in=new BufferedReader(new InputStreamReader(p.getInputStream()));
String line;
while((line=in.readLine())!=null)
{
if(line.startsWith("reply"))
System.out.println("this is reply");
else if(line.startsWith("Request"))
System.out.println("there is no reply");
else if(line.startsWith("destination"))
System.out.println("Destinator host unrecable");
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