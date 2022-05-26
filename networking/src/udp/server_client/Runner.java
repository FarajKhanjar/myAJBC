package networking.udp.server_client;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Runner 
{

	public static void main(String[] args)  throws UnknownHostException{
	{ 
	          // To get and print InetAddress of the Local Host
	        InetAddress address = InetAddress.getLocalHost();
	  
	        System.out.println("InetAddress of the Local Host : "+address);
	  
	        // To get and print host name of the Local Host
	        String hostName=address.getHostName();
	  
	        System.out.println("\nHost name of the Local Host : "+hostName);
	  
	}
	}
}
