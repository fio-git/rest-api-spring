package com.example.dao;

import org.springframework.stereotype.Repository;

@Repository
public class NumbersOperationsDAO {
	public int getSum(int a, int b) {
		return a+b;
	}

	public int getDifference(int a, int b) {
		return a-b;
	}

	public int getProduct(int a, int b) {
		return a*b;
	}

	public double getDivision(int a, int b) {
		if(b!=0)
			return a/b;
		return -99999;
	}
}
