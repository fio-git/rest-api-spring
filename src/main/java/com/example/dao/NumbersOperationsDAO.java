package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class NumbersOperationsDAO {
	public double getSum(double a, double b) {
		return a+b;
	}

	public double getDifference(double a, double b) {
		return a-b;
	}

	public double getProduct(double a, double b) {
		return a*b;
	}

	public double getDivision(double a, double b) {
		if(b!=0)
			return a/b;
		return -99999;
	}
}
