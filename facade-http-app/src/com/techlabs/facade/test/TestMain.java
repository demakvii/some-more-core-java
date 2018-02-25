package com.techlabs.facade.test;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.facade.HttpRequest;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = sc.nextInt();

		HttpRequest httpRequest = new HttpRequest(number);

		try {

			System.out.println(httpRequest.getResult());

		} catch (IOException e) {

			e.printStackTrace();

		}
		sc.close();
	}

}
