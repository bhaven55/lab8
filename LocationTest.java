import org.junit.Assert;
import org.junit.Test;

public class LocationTest {

	@Test
	public void Location() 
	{
		Location KITCHEN = Location.KITCHEN;
		Location CONSERVATORY = Location.CONSERVATORY;
		Location DINING_ROOM = Location.DINING_ROOM;
		Location BALLROOM = Location.BALLROOM;
		Location STUDY = Location.STUDY;
		Location HALL = Location.HALL;
		Location LOUNGE = Location.LOUNGE;
		Location LIBRARY = Location.LIBRARY;
		Location BILLIARD_ROOM = Location.BILLIARD_ROOM;
		
		String kitchen = KITCHEN.toString();
		String conservatory = CONSERVATORY.toString();
		String diningRoom = DINING_ROOM.toString();
		String ballroom = BALLROOM.toString();
		String study = STUDY.toString();
		String hall = HALL.toString();
		String lounge = LOUNGE.toString();
		String library = LIBRARY.toString();
		String billiardRoom = BILLIARD_ROOM.toString();
		
		Assert.assertEquals("Enum constants for Location class are not working", "KITCHEN", kitchen);
		Assert.assertEquals("Enum constants for Location class are not working", "CONSERVATORY", conservatory);
		Assert.assertEquals("Enum constants for Location class are not working", "DINING_ROOM", diningRoom);
		Assert.assertEquals("Enum constants for Location class are not working", "BALLROOM", ballroom);
		Assert.assertEquals("Enum constants for Location class are not working", "STUDY", study);
		Assert.assertEquals("Enum constants for Location class are not working", "HALL", hall);
		Assert.assertEquals("Enum constants for Location class are not working", "LOUNGE", lounge);
		Assert.assertEquals("Enum constants for Location class are not working", "LIBRARY", library);
		Assert.assertEquals("Enum constants for Location class are not working", "BILLIARD_ROOM", billiardRoom);
	}

}
