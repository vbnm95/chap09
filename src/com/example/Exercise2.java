package com.example;

public class Exercise2 {
	int n1;
	static int n2;
	
	void instanceMethod() {
		class A {
			
			void xxx() {
				System.out.println(n1);
				System.out.println(n2);
			}
		}
	}
	
	public static void main(String[] args) {
		class A {
			
			void xxx() {
				//System.out.println(n1);
				System.out.println(n2);
			}
		}
	}
}
