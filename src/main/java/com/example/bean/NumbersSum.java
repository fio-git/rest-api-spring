package com.accenture.bean;

public class NumbersSum {
	
	int numberOne;
	int numberTwo;
	int sum;
	
	public NumbersSum() {
		super();
	}
	
	
	public NumbersSum(int numberOne, int numberTwo) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.sum = this.numberOne + this.numberTwo;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	

}
