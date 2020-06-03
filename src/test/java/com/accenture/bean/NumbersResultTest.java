package com.accenture.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.bean.NumbersResult;

public class NumbersResultTest {

	NumbersResult inputValues = new NumbersResult(); 
	@Test
	public void testNumbersResult() {
		NumbersResult numbersResult = new NumbersResult();
		assertEquals(0.0, numbersResult.getNumberOne());
		assertEquals(0.0, numbersResult.getNumberTwo());
		assertEquals(null, numbersResult.getError());
		assertEquals(0.0, numbersResult.getResult());
	}

	@Test
	public void testNumbersResultDoubleDoubleCharDoubleString() {
		NumbersResult numbersResult = new NumbersResult(10, 20, '+', 30, null);
		assertEquals(10, numbersResult.getNumberOne());
		assertEquals(20, numbersResult.getNumberTwo());
		assertEquals(null, numbersResult.getError());
		assertEquals(30, numbersResult.getResult());
		assertEquals('+', numbersResult.getOp());
	}

	@Test
	public void testGetNumberOne() {
		inputValues.setNumberOne(10);
		assertEquals(10, inputValues.getNumberOne());
	}
	
	@Test
	public void testGetNumberTwo() {
		inputValues.setNumberTwo(10);
		assertEquals(10, inputValues.getNumberTwo());
	}
	
	@Test
	public void testSetNumberOne() {
		inputValues.setNumberOne(10);
		assertEquals(10, inputValues.getNumberOne());
	}
	
	@Test
	public void testSetNumberTwo() {
		inputValues.setNumberTwo(10);
		assertEquals(10, inputValues.getNumberTwo());
	}
	
	@Test
	public void testGetOp() {
		inputValues.setOp('+');
		assertEquals('+', inputValues.getOp());
	}
	
	@Test
	public void testSetOp() {
		inputValues.setOp('/');
		assertEquals('/', inputValues.getOp());
	}
	
	@Test
	public void testGetResult() {
		inputValues.setResult(30.0);
		assertEquals(30.0, inputValues.getResult());
	}

	@Test
	public void testSetResult() {
		inputValues.setResult(30.0);
		assertEquals(30.0, inputValues.getResult());
	}

	@Test
	public void testGetError() {
		inputValues.setError("ERROR OCCURRED");
		assertEquals("ERROR OCCURRED", inputValues.getError());
	}

	@Test
	public void testSetError() {
		inputValues.setError("ERROR OCCURRED");
		assertEquals("ERROR OCCURRED", inputValues.getError());
	}
}
