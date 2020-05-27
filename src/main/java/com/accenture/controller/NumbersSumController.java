package com.accenture.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.JavaRestService1Application;
import com.accenture.bean.InputNumbers;
import com.accenture.bean.NumbersSum;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class NumbersSumController {

	private static final Logger logger = LogManager.getLogger(JavaRestService1Application.class);

	 @RequestMapping(value = "/sumPost", method = RequestMethod.POST)
	    public ResponseEntity<NumbersSum> calculateSum2(@RequestBody InputNumbers input) {
		 	int n1 = input.getNum1();
		 	int n2 = input.getNum2();
		 	NumbersSum ns = new NumbersSum(n1, n2);
		 	logger.info("Number 1 : {}", ns.getNumberOne());
		 	logger.info("Number 2 : {}", ns.getNumberTwo());
		 	logger.info("Sum : {}", ns.getSum());
	        return ResponseEntity.accepted().body(ns);
	    }
	
	/*@GetMapping("/sum")
	public NumbersSum calculateSum(@RequestParam(value="numbers")String numbers) throws JsonMappingException, JsonProcessingException {
		final InputNumbers input = new ObjectMapper().readValue(numbers, InputNumbers.class);
		int num1 = input.getNum1();
		int num2 = input.getNum2();
		logger.info("Number 1 : {}", num1);
	 	logger.info("Number 2 : {}", num2);
	 	logger.info("Sum : {}", num1+num2);
		return new NumbersSum(num1, num2, num1+num2);
	}
	
	@GetMapping("/sumWithoutParam")
	public NumbersSum calculateSum1(InputNumbers numbers) {
		// InputNumbers in = (InputNumbers)numbers;
		int num1 = numbers.getNum1();
		int num2 = numbers.getNum2();
		logger.info("Number 1 : {}", num1);
	 	logger.info("Number 2 : {}", num2);
	 	logger.info("Sum : {}", num1+num2);
		return new NumbersSum(num1, num2, num1+num2);
	}
	
	@GetMapping("/")
	public String showMessage() {
		return "Hello";
	}*/
}
