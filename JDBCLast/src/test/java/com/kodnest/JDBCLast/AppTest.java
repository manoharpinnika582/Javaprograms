package com.kodnest.JDBCLast;

import org.junit.jupiter.api.Assertions;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
    {
	@org.junit.jupiter.api.Test
	public void sampleTest() {
		Calculator c=new Calculator();
		int res=c.add(10, 20);
		Assertions.assertEquals(30,res);
	}
	
	@org.junit.jupiter.api.Test
	public void sampleTest1() {
		Calculator c=new Calculator();
		int res=c.add(10, 20);
		Assertions.assertEquals(30,res);
	}
	
	@org.junit.jupiter.api.Test
	public void sampleTest2() {
		Calculator c=new Calculator();
		int res=c.add(10, 20);
		Assertions.assertEquals(30,res);
	}
	
	@org.junit.jupiter.api.Test
	public void sampleTest13() {
		Calculator c=new Calculator();
		int res=c.add(10, 20);
		Assertions.assertEquals(30,res);
	}
}
