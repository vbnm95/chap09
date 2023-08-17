package com.example;

public class OutterThisExample2 {
	int num = 100;
	static int num2 = 200;
	int num3 = 3000;
	
	class A {
		int num = 200;
		
		void xxx() {
			int num = 300;
			System.out.println("num =" + num);
			System.out.println("this.num =" + this.num);
			System.out.println("this.this.num =" + OutterThisExample2.this.num);
			System.out.println("num3 =" + num3);
		}
	}
	
	static class B {
	
	}
	
	public static void main(String[] args) {
		OutterThisExample2 o = new OutterThisExample2();
		A a = o.new A();
		a.xxx();
	}
}
