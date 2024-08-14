package git1;

import org.testng.annotations.Test;

public class demo 
{
@Test
public void main()
{
	int a=1;
	int b=2;
	int temp;
	{
		temp=a;
		a=b;
		b=temp;
	
		
	}
	System.out.println(a);
	System.out.println(b);
}
}
