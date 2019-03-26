import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void GamePieceAppearance() 
	{
		GamePieceAppearance GPA = new GamePieceAppearance(Color.RED, Shape.BOOT);
		Color color = GPA.getColor();
		Shape shape = GPA.getShape();
		
		Assert.assertEquals("The Enums constants for GamePieceAppearances are not working", Color.RED, color);
		Assert.assertEquals("The Enums constants for GamePieceAppearances are not working", Shape.BOOT, shape);
	}
	
	@Test
	public void getColor()
	{
		GamePieceAppearance GPA = new GamePieceAppearance(Color.RED, Shape.BOOT);
		Color color = GPA.getColor();
		
		Assert.assertEquals("The getColor method for GamePieceAppearance is not working", Color.RED, color);
	}
	
	@Test
	public void getShape()
	{
		GamePieceAppearance GPA = new GamePieceAppearance(Color.RED, Shape.BOOT);
		Shape shape = GPA.getShape();
		
		Assert.assertEquals("The getShape method for GamePieceAppearance is not working", Shape.BOOT, shape);
	}

}
