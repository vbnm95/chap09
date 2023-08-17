package com.example;

public class Exercise3 {
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	};
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			{
				System.out.println("Constructor");
			}
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
			
			public void show() {
				
			}

		};
		
		r.run();
		//r.show();
		
	}
}
