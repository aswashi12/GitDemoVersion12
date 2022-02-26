package com.javaoops;

public class Binumber {
	private int a;
	private int b;

	Binumber() {

	
	}

	Binumber(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public int add() {

		int sum;
		sum = this.a + this.b;
		return sum;

	}
	
	public int multiply()
	{
		int sum;
		sum = this.a*this.b;
		return sum;
		
	}
	
	public void doubling()
	{
		this.a = a *a;
		this.b =b*b;
		System.out.println("Double of A :"+ this.a);
		System.out.println("Double of B :"+ this.b);
		
	}
	
	public int getNumber1()
	{
		return this.a;
		
	}
	
	public int getNumber2()
	{
		return this.b;
	}

}
