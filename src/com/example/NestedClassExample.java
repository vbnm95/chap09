package com.example;

class Alpha {
	
}

public class NestedClassExample {
	
	int n1;			//인스턴스 멤버 클래스, 힙
	static int n2;	//정적 멤버 클래스, 메소드 영역(코드 영역)
	
	class A {
		
	}
	
	static class B {
		
	}
	
	public static void main(String[] args) {
		int n3;	// 로컬 변수 - 메소드 안에 있음, 스택 변수, 자동 변수, 임시 변수
		
		NestedClassExample n = new NestedClassExample();
		n.n1 = 10;
		NestedClassExample.n2 = 100;
		System.out.println(n.n1);
		System.out.println(NestedClassExample.n2);
		
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
	}

}
