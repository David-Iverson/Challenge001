package com.truecommerce;


import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
	// write your code here
        System.out.println("Hello World2");
        HttpClient httpClient = new DefaultHttpClient();

        URI destination = new URI("http://devtools.truecommerce.net:8080/");

        HttpPost httpOp = new HttpPost(destination);
        HttpResponse response = null;

        response = httpClient.execute(httpOp);

        String jsonResult;
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String line = null;
        StringBuilder sbuild = new StringBuilder();
        while ((line = rd.readLine()) != null) {
            sbuild.append(line);
        }
        jsonResult = sbuild.toString();
        System.out.println(jsonResult);

        // Parse the response into a list

        // For each entry in the list go and get some item details

        // Display the response


    }
}
