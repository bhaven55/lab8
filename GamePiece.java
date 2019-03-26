
public enum GamePiece 
{
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);
	
	
	// private fields defined by the GamePiece
	private GamePieceAppearance appearance;
	private int priority;
	
	
	/**
	 * 
	 * @param appearance
	 * @param priority
	 */
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}

	/**
	 * 
	 * @return The game piece's color.
	 */
	public Color getColor()
	{
		return this.appearance.getColor();
	}
	
	/**
	 * 
	 * @return The game piece's shape.
	 */
	public Shape getShape()
	{
		return this.appearance.getShape();
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return The game piece with the lowest priority value. That is, the game piece that would take its turn first
	 */
	public static GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if(a.priority > b.priority)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	
	/**
	 * A string of the format "%s: a %s %s with priority %d", 
	 * with replacements in order:
	 * (1) The name of the enum constant (e.g. BLUE_RACER)
	 * (2) The name of the game piece's color
	 * (3) The name of the game piece's shape
	 * (4) The priority value of the
	 */
	@Override
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", this.name(), this.getColor(), this.getShape(), this.priority);
	}
}
