# Andrew JRocket

Andrew JRocket is a simple and lightweight testing tool for Java projects. It's a port of Andrew Testing Library for JavaScript.

![logo](https://cdn1.iconfinder.com/data/icons/space-filled-outline-35/64/Rocket-256.png)

# SETTING UP JROCKET

- Download and put it somewhere in your project.
- Make the class you want to run JRocket at extend the JRocketTesting class
- Run the `begin()` function and pass the name of the test suit as its argument.
- Add the matchers and run the tests after that function.
- Finish the text with `end()`.
- Once the `end()` function is run, a report will be print to the screen with the execution time and the number of passed and failed tests.

```java
public class Example extends JRocketTesting {
	public void test() {
		begin("Compare two arrays");
		int [] x = {1,2,3,4};
		int [] y = {1,2,3,4};
		
		assertEquals(x,y);
		end();
	}
}
```

# MATCHERS
There are more than 20 matchers in JRocket.

## COMPARISON
- `assertEquals(int x, int y)`
- `assertEquals(float x, floats y)`
- `assertEquals(double x, double y)`
- `assertGreaterThan(int x, int y)`
- `assertGreaterThan(float x, float y)`
- `assertGreaterThan(double x, double y)`
- `assertLessThan(int x, int y)`
- `assertLessThan(float x, float y)`
- `assertLessThan(double x, double y)`
- `assertGreaterOrEqual(int x, int y)`
- `assertGreaterOrEqual(float x, float y)`
- `assertGreaterOrEqual(double x, double y)`
- `assertLessOrEqual(int x, int y)`
- `assertLessOrEqual(float x, float y)`
- `assertLessOrEqual(double x, double y)`

## STRING COMPARISON
- `assertEquals(String x, String y)`

## BOOLEAN EXPRESSIONS
- `assertTrue(boolean expr)`
- `assertFalse(boolean expr)`

## UNIDIMENSIONAL ARRAYS
- `assertEquals(int [] x, int [] y)`
- `assertEquals(float [] x, floats [] y)`
- `assertEquals(double [] x, double [] y)`
- `assertEquals(String [] x, String [] y)`
