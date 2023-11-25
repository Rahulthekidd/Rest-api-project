# Rest-api-project
This is a Rest Api Which gives information on domain and and DNS lookup!
# IP and Whois Domain Tools

This Java application provides tools for querying domain information, IP whois lookup, reverse whois from IP, and DNS lookup. It utilizes the RapidAPI service for data retrieval.

## Usage

### 1. API Key Setup

Before using the application, you need to obtain an API key from RapidAPI. Follow these steps:

1. Visit [RapidAPI](https://rapidapi.com/).
2. Sign up for an account (if you don't have one).
3. Subscribe to the [Whois Lookup API](https://rapidapi.com/zozor54/api/whois-lookup).
4. Retrieve your API key.

### 2. Set Up API Key in the Application

Open the `Controller` class and set your API key in the `key_grabber` method.

```java
public class Controller {
    // ...

    public void key_grabber() {
        System.out.println("Kindly enter the App Api key from Rapid api: ");
        key = scanner.next();
        // Consume the newline character
        scanner.nextLine();
    }

    // ...
}

Sure, I can help you generate a simple README file for your GitHub repository based on the provided code. Here's a basic README:

markdown
Copy code
# IP and Whois Domain Tools

This Java application provides tools for querying domain information, IP whois lookup, reverse whois from IP, and DNS lookup. It utilizes the RapidAPI service for data retrieval.

## Usage

### 1. API Key Setup

Before using the application, you need to obtain an API key from RapidAPI. Follow these steps:

<h1>1. Visit [RapidAPI](https://rapidapi.com/).</h1>
<h1>2. Sign up for an account (if you don't have one).</h1>
<h1>3. Subscribe to the [Whois Lookup API](https://rapidapi.com/zozor54/api/whois-lookup).</h1>
<h1>4. Retrieve your API key.</h1>

### 2. Set Up API Key in the Application

Open the `Controller` class and set your API key in the `key_grabber` method.

```java
public class Controller {
    // ...

    public void key_grabber() {
        System.out.println("Kindly enter the App Api key from Rapid api: ");
        key = scanner.next();
        // Consume the newline character
        scanner.nextLine();
    }

    // ...
}
<h1>3. Run the Application</h1>
Run the application to perform various tasks:

Domain Information Lookup
IP Whois Lookup
Reverse Whois from IP
DNS Lookup
Examples
Here are a few examples of how to use the application:

Domain Information Lookup
java
Copy code
public void domain_caller() throws IOException, InterruptedException {
    // ...
}
IP Whois Lookup
java
Copy code
public void whois_ip() throws IOException, InterruptedException {
    // ...
}
Reverse Whois from IP
java
Copy code
public void get_info_from_domain_ip() throws IOException, InterruptedException {
    // ...
}
DNS Lookup
java
Copy code
public void NsLookup() throws IOException, InterruptedException {
    // ...
}
Contributing
If you have improvements or suggestions for the project, feel free to contribute. Fork the repository, make your changes, and submit a pull request.

License
This project is licensed under the MIT License.
