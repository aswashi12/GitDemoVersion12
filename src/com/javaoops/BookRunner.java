package com.javaoops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(40);
		Book cleanCode = new Book(10);
		
		artOfComputerProgramming.settNoOfCopies(10);
		effectiveJava.settNoOfCopies(33);
		cleanCode.settNoOfCopies(34);
		System.out.println(cleanCode.getNoOfCopies());
		cleanCode.decreaseNoOfCopies(4);
		System.out.println(cleanCode.getNoOfCopies());
		
		
	}

}
