package jrocket;

import testing.JRocketTesting;

/*
 * Importar JRocketTesting, extender a classe com o JRocketTesting
 * */
public class Example extends JRocketTesting {
	public void test() {
		//begins the test
		begin();
		int [] x = {2,4,6,8};
		int [] y = {2,4,6,8};
		
		/*
		 * Compare two elements using matchers
		 * */
		assertEquals(x,y);
		assertEquals("a", "a");
		assertEquals(2.1, 2.1);
		assertEquals(2,2);
		//Finish the tests and print the report
		end();
	}
}
