package cn.osxm.ssmi.chp06;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGHelloWorld {
	private int iNo = 0;

	@BeforeClass
	public void mySetUp() {
		// "Initial Some ...."
		iNo = 1;
	}

	@Test()
	public void tStr() {
		Assert.assertEquals(iNo, 1);
	}
}
