import org.junit.Assert;
import org.junit.Test;

public class ColorTest 
{
	@Test
	public void Color()
	{
		Color blue = Color.BLUE;
		String answer = blue.toString();
		Assert.assertEquals("Enum constants are not working", "BLUE", answer);
	}
	
	@Test
	public void getR()
	{
		Color blue = Color.BLUE;
		int answer = blue.getR();
		Assert.assertEquals("getR method in Color class is not working", 0, answer);
	}
	
	@Test
	public void getG()
	{
		Color blue = Color.BLUE;
		int answer = blue.getG();
		Assert.assertEquals("getG method in Color class is not working", 0, answer);
	}
	
	@Test
	public void getB()
	{
		Color blue = Color.BLUE;
		int answer = blue.getB();
		Assert.assertEquals("getB method in Color class is not working", 255, answer);
	}
}
