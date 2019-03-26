import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {

	@Test
	public void TestGamePiece() 
	{
		GamePiece blueBoot = GamePiece.BLUE_BOOT;
		GamePiece blueRacer = GamePiece.BLUE_RACER;
		GamePiece greenBoot = GamePiece.GREEN_BOOT;
		GamePiece magentaRacer = GamePiece.MAGENTA_RACER;
		GamePiece redRacer = GamePiece.RED_RACER;
		GamePiece redThimble = GamePiece.RED_THIMBLE;
		GamePiece yellowBoot = GamePiece.YELLOW_BOOT;
		
		String BB = blueBoot.toString();
		String BR = blueRacer.toString();
		String GB = greenBoot.toString();
		String MR = magentaRacer.toString();
		String RR = redRacer.toString();
		String RT = redThimble.toString();
		String YB = yellowBoot.toString();
		
		String BB1 = "BLUE_BOOT: a BLUE boot with priority 5";
		String BR1 = "BLUE_RACER: a BLUE racecar with priority 2";
		String GB1 = "GREEN_BOOT: a GREEN boot with priority 8";
		String MR1 = "MAGENTA_RACER: a MAGENTA racecar with priority 1";
		String RR1 = "RED_RACER: a RED racecar with priority 0";
		String RT1 = "RED_THIMBLE: a RED thimble with priority 10";
		String YB1 = "YELLOW_BOOT: a YELLOW boot with priority 7";
		
		Assert.assertEquals("Enum constants for GamePiece class are not working", BB1, BB);
		Assert.assertEquals("Enum constants for GamePiece class are not working", BR1, BR);
		Assert.assertEquals("Enum constants for GamePiece class are not working", GB1, GB);
		Assert.assertEquals("Enum constants for GamePiece class are not working", MR1, MR);
		Assert.assertEquals("Enum constants for GamePiece class are not working", RR1, RR);
		Assert.assertEquals("Enum constants for GamePiece class are not working", RT1, RT);
		Assert.assertEquals("Enum constants for GamePiece class are not working", YB1, YB);
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
