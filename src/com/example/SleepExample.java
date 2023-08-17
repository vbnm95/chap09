package com.example;

public class SleepExample {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("10초 후에 실행됩니다.");
		
		Thread.sleep(10000);
		
		System.out.println("종료");
	}
	
	public static void main3(String[] args) {
		String str = null;
		
		System.out.println(str.toUpperCase()); // NullPointerException
		
		NullPointerException err = new NullPointerException();
		
	}
	
	public static void main2(String[] args) {
		int num = 100;
		int result = num / 0; // ArithmeticException

		System.out.println("result =" + result);
	}
}
