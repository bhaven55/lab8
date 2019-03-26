import org.junit.Assert;
import org.junit.Test;

public class ShapeTest 
{

	@Test
	public void Shape()
	{
		Shape shape = Shape.BOOT;
		String answer = shape.toString();
		Assert.assertEquals("Enum constant and toString for Shape class are not working", "boot", answer);
	}

}
