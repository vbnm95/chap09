package com.example;

public class Exercise4 {

	public static void main(String[] args) {
		
		int num = 100;
		//num = 200;
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(num);
			}
		};
		
	}
}
