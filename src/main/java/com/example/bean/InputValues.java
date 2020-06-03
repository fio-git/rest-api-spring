package com.example.bean;

public class InputValues {
	double numberOne;
	double numberTwo;
	char op;
	
	public InputValues() {
		super();
	}

	public InputValues(double numberOne, double numberTwo, char op) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.op = op;
	}

	public double getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}

	public double getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}
	
	
	
	
}
