package org.test;

public class Sample {
	public void userName() {
		System.out.println("UserName Details");
	}

	public void login() {
		System.out.println("Login Details");
	}

	public static void main(String[] args) {
		Sample z = new Sample();
		z.login();
		z.userName();
	}
}