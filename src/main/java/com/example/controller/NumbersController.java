package com.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaRestService1Application;
import com.example.bean.InputValues;
import com.example.bean.NumbersResult;
import com.example.service.NumbersOperationsService;

@RestController
public class NumbersController {

	@Autowired
	private NumbersOperationsService numbersOperations;
	private static final Logger logger = LogManager.getLogger(JavaRestService1Application.class);

	@PostMapping(value = "/result")
	public ResponseEntity<NumbersResult> calculateResult(@RequestBody InputValues input) {
		double a = input.getNumberOne();
		double b = input.getNumberTwo();
		char op = input.getOp();
		double result=numbersOperations.getResult(a, b, op);
		String error = "NA";
		if(result==0.0)
		{
			logger.error("Divide By 0 Error");
			error = "ERROR OCCURRED! CHECK OPERANDS AND OPERATORS";
		}
		NumbersResult nr = new NumbersResult(a, b, op, result, error);
		return ResponseEntity.accepted().body(nr);
	}
	
	
}
