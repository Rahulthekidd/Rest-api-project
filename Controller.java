package Ipandwhoisdomaintools;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Controller {
	Scanner scanner = new Scanner(System.in);
	public String key;
	
	public void key_grabber() {
	    System.out.println("Kindly enter the App Api key from Rapid api : ");
	    key = scanner.next();
	    // Consume the newline character
	    scanner.nextLine();
	}

	public void domain_caller() throws IOException, InterruptedException {
		
		System.out.println("Get your domain information easily\r\n"
				+ "\r\n"
				+ "");
		
		 System.out.print("Enter the domain name (e.g., discord.com): ");
	     String domain = scanner.nextLine();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://zozor54-whois-lookup-v1.p.rapidapi.com/?domain="+domain+"&format=json&_forceRefresh=0"))
				.header("X-RapidAPI-Key", key)
				.header("X-RapidAPI-Host", "zozor54-whois-lookup-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}
	
	public void whois_ip() throws IOException, InterruptedException {
		
		System.out.println("Get 250 random whois from our database.\r\n"
				+ "All these whois are from registered domain.");
		
		System.out.print("Enter the ip (e.g., 127.0.0.1): ");
        String ip = scanner.nextLine();
		
		
		HttpRequest request1 = HttpRequest.newBuilder()
				.uri(URI.create("https://zozor54-whois-lookup-v1.p.rapidapi.com/"+ip))
				.header("X-RapidAPI-Key", key)
				.header("X-RapidAPI-Host", "zozor54-whois-lookup-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response1 = HttpClient.newHttpClient().send(request1, HttpResponse.BodyHandlers.ofString());
		System.out.println(response1.body());
	}

	public void get_info_from_domain_ip() throws IOException, InterruptedException {
		
		System.out.println("Get reverse Whois from Ip.\r\n"
				+ "\r\n"
				+ "		");
		
		 System.out.print("Enter the domain ip :  (e.g., 216.58.213.1): ");
		 String ip = scanner.nextLine();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://zozor54-whois-lookup-v1.p.rapidapi.com/getDomainsFromIp?ip="+ip))
				.header("X-RapidAPI-Key", key)
				.header("X-RapidAPI-Host", "zozor54-whois-lookup-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}
	
	public void NsLookup() throws IOException, InterruptedException {
		
		System.out.println("NsLookup queries the specified DNS server and retrieves the requested records that are associated with the domain name you provided. These records contain information like the domain name’s IP addresses.\r\n"
				+ "\r\n"
				+ "The following types of DNS records are especially useful\n");
		System.out.print("DNS LookUp, Enter the domain name (e.g., discord.com): ");
	     String domain = scanner.nextLine();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://zozor54-whois-lookup-v1.p.rapidapi.com/nslookup?domain="+domain))
				.header("X-RapidAPI-Key", key)
				.header("X-RapidAPI-Host", "zozor54-whois-lookup-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}
	
	
	
}
