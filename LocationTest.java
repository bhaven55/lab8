import org.junit.Assert;
import org.junit.Test;

public class LocationTest {

	@Test
	public void Location() 
	{
		Location loc = Location.HALL;
		String Answer = loc.toString();
		Assert.assertEquals("Enum constants for Location class are not working", "HALL", Answer);
	}

}
