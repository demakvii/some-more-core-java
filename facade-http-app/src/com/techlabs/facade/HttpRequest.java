package com.techlabs.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {

	private int anyNumber;

	public HttpRequest(int anyNumber) {
		this.anyNumber = anyNumber;
	}

	public String getResult() throws IOException {
		URL url = new URL("http://numbersapi.com/" + this.anyNumber);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		BufferedReader in = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		return response.toString();

	}
}
