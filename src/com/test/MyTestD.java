package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.build.MyTest;

public class MyTestD {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyTest langTest = new MyTest();  
        String s = "Lemu";
        
        assertEquals("蕾姆赛高！！！",langTest.D(s));
	}

}
