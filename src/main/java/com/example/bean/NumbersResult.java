package com.example.bean;

public class NumbersResult {
	double numberOne;
	double numberTwo;
	char op;
	double result;
	String error;
	public NumbersResult() {
		super();
	}
	public NumbersResult(double numberOne, double numberTwo, char op, double result, String error) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.op = op;
		this.result = result;
		this.error = error;
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
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
}
