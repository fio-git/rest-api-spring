package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NumbersOperationsDAO;

@Service
public class NumbersOperationsService implements INumbersOperation{

	@Autowired
	private NumbersOperationsDAO numbersDao;
	
	@Override
	public int getSum(int a, int b) {
		return numbersDao.getSum(a, b);
	}

	@Override
	public int getDifference(int a, int b) {
		return numbersDao.getDifference(a, b);
	}

	@Override
	public int getProduct(int a, int b) {
		return numbersDao.getProduct(a, b);
	}

	@Override
	public double getDivision(int a, int b) {
		return numbersDao.getDivision(a, b);
	}

}
