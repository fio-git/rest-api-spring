package com.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaRestService1Application;
import com.example.dao.NumbersOperationsDAO;

@Service
public class NumbersOperationsService implements INumbersOperation{

	private static final Logger logger = LogManager.getLogger(JavaRestService1Application.class);

	@Autowired
	private NumbersOperationsDAO numbersDao;

	@Override
	public double getSum(double a, double b) {
		return numbersDao.getSum(a, b);
	}

	@Override
	public double getDifference(double a, double b) {
		return numbersDao.getDifference(a, b);
	}

	@Override
	public double getProduct(double a, double b) {
		return numbersDao.getProduct(a, b);
	}

	@Override
	public double getDivision(double a, double b) {
		return numbersDao.getDivision(a, b);
	}

	public double getResult(double a, double b, char op) {
		double result = 0.0;
		switch(op) {
		case '+': result = getSum(a, b);
		break;
		case '-': result = getDifference(a, b);
		break;
		case '*': result = getProduct(a, b);
		break;
		case '/': {if(b!=0)
			result = getDivision(a, b);}
		break;
		default: logger.error("Invalid Operator");
		}
		return result;
	}

}
