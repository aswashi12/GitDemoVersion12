package com.javaoops;

public class Book {
	private int noOfCopies;
	
	Book (int noOfCopies)
	{
		this.noOfCopies = noOfCopies;
	}

	public void settNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;

	}

	public void increaseNoOfCopies(int howMuch) {
		settNoOfCopies(this.noOfCopies + howMuch);

	}

	public void decreaseNoOfCopies(int howMuch) {
		settNoOfCopies(this.noOfCopies - howMuch);

	}
}
