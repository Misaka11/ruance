package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTestA {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
        MyTest langTest = new MyTest();  
        String s1 = "le mu ha su ki de su";
        String s2 = "lemuhasukidesu";
        
        assertEquals("蕾姆赛高！！！",langTest.A(s1, s2)); 
        
	}
	
	@Test
	public void test2() {
		//针对错误的测试用例，最后一个字符不同
        MyTest langTest = new MyTest();  
        String s1 = "le mu ha su ki de su";
        String s2 = "lemuhasukidesi";
        
        assertEquals("两个字符串删除空格后不相同",langTest.A(s1, s2));
        
	}
	
	@Test
	public void test3() {
		
        MyTest langTest = new MyTest();  
        String s1 = "le mu ka wa i";
        String s2 = "la mu";
        
        assertEquals("两个字符串删除空格后不相同",langTest.A(s1, s2));
        
	}
	
	@Test
	public void test4() {
		
        MyTest langTest = new MyTest();  
        String s1 = "le";
        String s2 = "la";
        
        assertEquals("两个字符串删除空格后不相同",langTest.A(s1, s2));
        
	}
}
