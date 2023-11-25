package Ipandwhoisdomaintools;

import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("unused")
public class Model {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
			
		Scanner sc= new Scanner(System.in);

		Controller scv = new Controller();
		
		scv.key_grabber();
		
		System.out.println("What tools do you want to use?\n1. NsLookup\n2. Domain info\n3. Domain IP info\n4. Whois IP\nKindly enter your choice >>");
		int flag = sc.nextInt();

		switch (flag) {
		    case 1:
		        // Code for NsLookup
		    	scv.NsLookup();
		        break;
		    case 2:
		        // Code for Domain info
		    	scv.domain_caller();
		        break;
		    case 3:
		        // Code for Domain IP info
		    	scv.get_info_from_domain_ip();
		        break;
		    case 4:
		        // Code for Whois IP
		    	scv.whois_ip();
		        break;
		    default:
		        System.out.println("Invalid choice.");
		}

		
		
	}

}
