package com.example;

public class OutterClassExample {
	
	public class A {
		int n1;
		static int n2;
	}
	
	protected static class B {
		int n1;
		static int n2;
	}
	
	public static void main(String[] args) {
		class C {
			int n1;
			static int n2;
		}
		
		OutterClassExample o = new OutterClassExample();
		A a = o.new A();
		B b = new B();
		C c = new C();
	}

}
