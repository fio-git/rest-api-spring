package com.accenture.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.bean.InputValues;

public class InputValuesTest 
{
	InputValues inputValues = new InputValues();

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
	public void testParameterizedConstructor() {
		InputValues inputValues1 = new InputValues(10, 20, '-');
		assertEquals(10, inputValues1.getNumberOne());
		assertEquals(20, inputValues1.getNumberTwo());
		assertEquals('-', inputValues1.getOp());
	}

}
