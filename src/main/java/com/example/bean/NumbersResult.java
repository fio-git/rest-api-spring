package com.example.bean;

public class NumbersResult {
	int numberOne;
	int numberTwo;
	char op;
	double result;
	String error;
	public NumbersResult() {
		super();
	}
	public NumbersResult(int numberOne, int numberTwo, char op, double result, String error) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.op = op;
		this.result = result;
		this.error = error;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
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
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

}
