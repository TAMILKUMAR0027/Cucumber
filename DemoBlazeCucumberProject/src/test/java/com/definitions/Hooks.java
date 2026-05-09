package com.definitions;

import com.utilities.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setup() {
		HelperClass.setup();
		
	}
	@After
	public void close() {
		HelperClass.tearDown();
	}
}
