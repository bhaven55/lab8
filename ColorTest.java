import org.junit.Assert;
import org.junit.Test;

public class ColorTest 
{
	@Test
	public void Color()
	{
		Color blue = Color.BLUE;
		Color cyan = Color.CYAN;
		Color green = Color.GREEN;
		Color magenta = Color.MAGENTA;
		Color red = Color.RED;
		Color yellow = Color.YELLOW;
		
		String Blue = blue.toString();
		String Cyan = cyan.toString();
		String Green = green.toString();
		String Magenta = magenta.toString();
		String Red = red.toString();
		String Yellow = yellow.toString();
		
		Assert.assertEquals("Enum constants are not working", "BLUE", Blue);
		Assert.assertEquals("Enum constants are not working", "CYAN", Cyan);
		Assert.assertEquals("Enum constants are not working", "GREEN", Green);
		Assert.assertEquals("Enum constants are not working", "MAGENTA", Magenta);
		Assert.assertEquals("Enum constants are not working", "RED", Red);
		Assert.assertEquals("Enum constants are not working", "YELLOW", Yellow);
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
