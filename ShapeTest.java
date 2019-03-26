import org.junit.Assert;
import org.junit.Test;

public class ShapeTest 
{

	@Test
	public void Shape()
	{
		Shape THIMBLE = Shape.THIMBLE;
		Shape BOOT = Shape.BOOT;
		Shape RACECAR = Shape.RACECAR;
		
		String thimble = THIMBLE.toString();
		String boot = BOOT.toString();
		String racecar = RACECAR.toString();
		
		Assert.assertEquals("Enum constant and toString for Shape class are not working", "thimble", thimble);
		Assert.assertEquals("Enum constant and toString for Shape class are not working", "boot", boot);
		Assert.assertEquals("Enum constant and toString for Shape class are not working", "racecar", racecar);
		
	}

}
