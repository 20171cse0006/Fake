import java.net.*;
import java.util.*;

public class IPFinder
{
	public static void main(String args[])
	{
		String host;
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nEnter host name:");
		host=input.next();
		try
		{
		InetAddress address = InetAddress.getByName(host);
		System.out.print("IP Addess:" + address.toString());
		}
		catch(UnknownHostException unEx)
		{
		System.out.println("Could not find"+host);
		}
	}
}
