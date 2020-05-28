package com.example.bean;

public class InputValues {
	int numberOne;
	int numberTwo;
	char op;
	
	public InputValues() {
		super();
	}
	
	public InputValues(int numberOne, int numberTwo, char op) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.op = op;
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
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}
	
	
}
