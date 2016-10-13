package com.maven.test.FirstMavenPrjct;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculator.Calculator;

@RunWith(Parameterized.class)
public class ParametrizedTest {


public static int a;
public static int b;
public static int expected;

	public ParametrizedTest(int a, int b, int expected){
		this.a=a;
		this.b = b;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object [][]{{1,2,3},{3,4,7}});	
	}
	
	@Test
	public void test(){
		Assert.assertEquals(expected, Calculator.add(a, b));
	}
		
	}


