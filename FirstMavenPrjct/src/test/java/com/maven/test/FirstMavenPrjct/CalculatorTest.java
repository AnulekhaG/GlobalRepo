package com.maven.test.FirstMavenPrjct;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test method");
	}

	@Test
	public void add() {
		int expected = 5;
		int actual = Calculator.add(2, 3);
		Assert.assertEquals(expected, actual);
		System.out.println("For add");
	}
	@Test
	public void addZero() {
		int expected = 2;
		int actual = Calculator.add(2, 0);
		Assert.assertEquals(expected, actual);
		System.out.println("For add zero");
	}
	@Test(expected = ArithmeticException.class)
	public void div() {
		 Calculator.div(10, 0);
		//Assert.assertEquals(expected, actual);
		System.out.println("For div");
	}
	

}
