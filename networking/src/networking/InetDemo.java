package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetDemo {

	public static void main(String[] args) throws UnknownHostException 
	{
		// obtain the IP address of the localhost (the computer the program is running on):
		//InetAddress Address = InetAddress.getLocalHost();

		// print the InetAddress Object of localhost
		// System.out.println("locahost InetAddress: " + Address);

		// print the address only
		//System.out.println("locahost host address: " + Address.getHostAddress());
		// print the name only
		//System.out.println("locahost host name: " + Address.getHostName());
		
		
		// get all IP address of a website
		/*
		 * InetAddress[] addresses = InetAddress.getAllByName("www.google.com"); for
		 * (int i = 0; i < addresses.length; i++) System.out.println(addresses[i]);
		 * System.out.println(Arrays.toString(addresses));
		 */

		// get the InetAddress for a String representation of an IP address
		/* Address = InetAddress.getByName("10.0.0.23");
		 print the address of the website
		 System.out.println("localhost InetAddress: " + Address); // loopback
		*/

		// loopback address
	/*	InetAddress myLoop = InetAddress.getLoopbackAddress();
		System.out.println();
		System.out.println(myLoop);
		*/
		
		InetAddress Address = InetAddress.getLocalHost();

		// print the InetAddress Object of localhost
		System.out.println("Locahost address: " + Address.getHostAddress());
		System.out.println("Locahost name: " + Address.getHostName()+"\n");


		// find the IP address of a website
		Address = InetAddress.getByName("english.tau.ac.il");

		// print the address of the website
		System.out.println("TAU website IP address: " + Address.getHostAddress());
		System.out.println("TAU website HostName: " + Address.getHostName()+"\n");


		// find out the ip address and host of your university website
		Address = InetAddress.getByName("www.facebook.com");

		// find the ip address and host of facebook
		System.out.println("Facebook IP address: " + Address.getHostAddress());
		System.out.println("Facebook HostName: " + Address.getHostName());
		


	}

}
