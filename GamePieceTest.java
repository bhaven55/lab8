import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {

	@Test
	public void TestGamePiece() 
	{
		GamePiece GP = GamePiece.RED_RACER;
		String answer = GP.toString();
		String expected = "RED_RACER: a RED racecar with priority 0";
		
		Assert.assertEquals("Enum constants for GamePiece class are not working", expected, answer);
	}
	
	@Test
	public void getColorTest()
	{
		GamePiece GP = GamePiece.RED_RACER;
		Color color = GP.getColor();
		
		Assert.assertEquals("getColor method for GamePiece is not working", Color.RED, color);
	}
	
	@Test
	public void getShapeTest()
	{
		GamePiece GP = GamePiece.RED_RACER;
		Shape shape = GP.getShape();
		
		Assert.assertEquals("getShape method for GamePiece is not working", Shape.RACECAR, shape);
	}
	
	@Test
	public void movesFirst()
	{
		GamePiece five = GamePiece.BLUE_BOOT;
		GamePiece two = GamePiece.BLUE_RACER;
		GamePiece eight = GamePiece.GREEN_BOOT;
		
		GamePiece answer = GamePiece.movesFirst(five, two);
		GamePiece answer1 = GamePiece.movesFirst(five, eight);
		
		Assert.assertEquals("movesFirst method for GamePiece is not working", two, answer);
		Assert.assertEquals("movesFirst method for GamePiece is not working", five, answer1);
	}
	
	@Test
	public void toStringTest()
	{
		GamePiece GP = GamePiece.RED_RACER;
		String answer = GP.toString();
		String expected = "RED_RACER: a RED racecar with priority 0";
		
		Assert.assertEquals("toString method for GamePiece is not working", expected, answer);
	}
}
