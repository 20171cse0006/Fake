import java.net.*;
import java.util.*;

public class Program1
{
	public static void main(String args[])
	{
		try
		{
		InetAddress address = InetAddress.getLocalHost();
		System.out.print("IP Addess:" + address.toString());
		}
		catch(UnknownHostException unEx)
		{
		System.out.println("Could not find");
		}
	}
}
