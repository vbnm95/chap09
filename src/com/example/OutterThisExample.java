package com.example;

public class OutterThisExample {
	int num = 100;
	static int num2 = 200;
	
	class A {
		void xxx() {
			num += 10;
			num2 += 10;
		}
	}
	
	static class B {
		void xxx() {
			//num += 10;
			num2 += 10;
		}
	}
	
	void print() {
		class D {
			void xxx() {
				num += 10;
				num2 += 10;
			}
			
			static void yyy() {
				//num += 10;
				num2 += 10;
			}
		}
	}
	
	public static void main(String[] args) {
		//num += 10;
		
		class C {
			void xxx() {
				//num += 10;
				num2 += 10;
			}
		}
	}
}
