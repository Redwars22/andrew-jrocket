# andrew-jrocket

![](https://cdn1.iconfinder.com/data/icons/space-filled-outline-35/64/Rocket-256.png)

How to use JRocket:

- Put it somewhere in your project.
- Make the class you want to run JRocket at extend the JRocketTesting class
- Run the begin() function and pass the name of the test suit as its argument.
- Add the matchers and run the tests after that function.
- Finish the text with end().
- Once the end() function is run, a report will be print to the screen with the execution time and the number of passed and failed tests.

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
