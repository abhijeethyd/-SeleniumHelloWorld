package com.automationpractie.junittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NavigatetoLogin {

	@BeforeClass
	public static void runsBeforeSuite() {
		System.out.println("This Method executes Before All the Tests Only Once");
	}
	
	@Before
	public void runsBeforeEveryTest() {
		
		System.out.println("Runs before every Test");
		
	}
	
	@Test
	public void testOne() {
	
		System.out.println("First Test");
	}
	
	@Test
	public void testTwo() {
	
		System.out.println("Second Test");
	}
	
	@After
	public void runsAfterEveryTest() {
		
		System.out.println("Runs After Every Test");
		
	}
	
	@AfterClass
	public static void runsAfterTestSuite() {
		
		System.out.println("Runs After All Tests Only Once");
		
	}
	
	

}
