package v1;

import org.testng.annotations.Test;

public class Math {
	
	public int add(int a , int b)
	{
		return a+b;
	}
	
	public int sub(int a , int b) {
		return a-b;
	}
	
	public int mul(int a , int b)
	{
		return a*b;
	}
	
	

	@Test
	public void testMath() {
		System.out.println("Add value"+add(12,10));
		System.out.println("Sub value"+sub(12, 2));
		System.out.println("Hello World");
		System.out.println("Data");
		System.out.println("H");
		System.out.println("Moto");
		System.out.println(mul(12,29));
	}
}
