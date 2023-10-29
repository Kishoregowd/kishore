package september26th;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import september25th.Base;

public class TestingProgram extends Base {

	@BeforeClass
	private void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("beforeMethod");

	}

	@Test
	private void test() {
		System.out.println("test");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("afterClass");

	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("afterClass");

	}

}
