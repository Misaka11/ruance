package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTestB {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		MyTest langTest = new MyTest();  
        String s = "le mu ha su ki de su";
        
        assertEquals("lemuhasukidesu",langTest.B(s));
	}
	
	@Test
	public void test2() {
		MyTest langTest = new MyTest();  
        String s = " ";
        
        assertEquals("",langTest.B(s));
	}
}
