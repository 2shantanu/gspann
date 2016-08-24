package com.a.b;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CTest {
	//test test 1
	@Test
	public void t1(){
		System.out.println("Hi I am Test t1");
		Assert.assertTrue(true, "");
		
	}
	
	@Test
	public void t2(){
		System.out.println("Hi I am Test t2");
		Assert.assertTrue(false, "");
		
	}
	
	@Test
	public void t3(){
		System.out.println("Hi I am Test t3");
		Assert.assertTrue(true, "");
		
	}
	
}
