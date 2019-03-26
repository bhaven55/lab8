import java.util.Arrays;

public class Driver 
{

	public static void main(String[] args) 
	{
		/**
		 * all the constants from the Color enum class
		 */
		Color red = Color.RED;
		Color green = Color.GREEN;
		Color blue = Color.BLUE;
		Color yellow = Color.YELLOW;
		Color cyan = Color.CYAN;
		Color magenta = Color.MAGENTA;
		
		/**
		 * all the colors are printed out with their rgb
		 */
		System.out.println("Each Color with their rgb:");
		System.out.println(red + ": red - " + red.getR() + ", green - " + red.getG() + ", blue - " + red.getB());
		System.out.println(green + ": red - " + green.getR() + ", green - " + green.getG() + ", blue - " + green.getB());
		System.out.println(blue + ": red - " + blue.getR() + ", green - " + blue.getG() + ", blue - " + blue.getB());
		System.out.println(yellow + ": red - " + yellow.getR() + ", green - " + yellow.getG() + ", blue - " + yellow.getB());
		System.out.println(cyan + ": red - " + cyan.getR() + ", green - " + cyan.getG() + ", blue - " + cyan.getB());
		System.out.println(magenta + ": red - " + magenta.getR() + ", green - " + magenta.getG() + ", blue - " + magenta.getB());
		
		System.out.println(); // new line
		
		/**
		 * all the constants from the Shape enum class
		 */
		Shape thimble = Shape.THIMBLE;
		Shape boot = Shape.BOOT;
		Shape racecar = Shape.RACECAR;
		
		/**
		 * all the shapes are printed
		 */
		System.out.println("Each Shape name:");
		System.out.println(thimble.toString());
		System.out.println(boot.toString());
		System.out.println(racecar.toString());
		
		//new line
		System.out.println();
		
		/**
		 * all enum Constants from Location class
		 */
		Location kitchen = Location.KITCHEN;
		Location conservatory = Location.CONSERVATORY;
		Location dining_room = Location.DINING_ROOM;
		Location ballroom = Location.BALLROOM;
		Location study = Location.STUDY;
		Location hall = Location.HALL;
		Location lounge = Location.LOUNGE;
		Location library = Location.LIBRARY;
		Location billiard_room = Location.BILLIARD_ROOM;
		
		/**
		 * printed all the location from Location class
		 */
		System.out.println("Each Location name:");
		System.out.println(kitchen);
		System.out.println(conservatory);
		System.out.println(dining_room);
		System.out.println(ballroom);
		System.out.println(study);
		System.out.println(hall);
		System.out.println(lounge);
		System.out.println(library);
		System.out.println(billiard_room);
		
		//new Line
		System.out.println();
		
		/*
		 * GamePieceAppearance
		 */
		GamePieceAppearance GPA = new GamePieceAppearance(Color.RED, Shape.BOOT);
		Color color = GPA.getColor();
		Shape shape = GPA.getShape();
		
		System.out.println("Color of the GamePieceAppearance:");
		System.out.println(color);
		System.out.println("Shape of the GamePieceAppearance:");
		System.out.println(shape);
		
		//new Line
		System.out.println();
		
		/**
		 * all enum Constants from GamePiece class are created
		 */
		
		GamePiece blueBoot = GamePiece.BLUE_BOOT;
		GamePiece blueRacer = GamePiece.BLUE_RACER;
		GamePiece greenBoot = GamePiece.GREEN_BOOT;
		GamePiece magentaRacer = GamePiece.MAGENTA_RACER;
		GamePiece redRacer = GamePiece.RED_RACER;
		GamePiece redThimble = GamePiece.RED_THIMBLE;
		GamePiece yellowBoot = GamePiece.YELLOW_BOOT;
		
		/**
		 * all GamePieces are printed out with their color and shape
		 */
		System.out.println("Each GamePiece with Color, Shape, and priority:");
		System.out.println(blueBoot.toString());
		System.out.println(blueRacer.toString());
		System.out.println(greenBoot.toString());
		System.out.println(magentaRacer.toString());
		System.out.println(redRacer.toString());
		System.out.println(redThimble.toString());
		System.out.println(yellowBoot.toString());
		
		//new Line
		System.out.println();
		
		/**
		 * which moves GamePiece moves first
		 */
		System.out.println("The GamePiece that moves first:");
		System.out.println(GamePiece.movesFirst(blueBoot, blueRacer));
		System.out.println(GamePiece.movesFirst(blueRacer, greenBoot));
		System.out.println(GamePiece.movesFirst(greenBoot, magentaRacer));
		System.out.println(GamePiece.movesFirst(magentaRacer, redRacer));
		System.out.println(GamePiece.movesFirst(redRacer, redThimble));
		System.out.println(GamePiece.movesFirst(redThimble, yellowBoot));
		System.out.println(GamePiece.movesFirst(yellowBoot, blueBoot));
		
		// New Line
		System.out.println();
		
		/**
		 * new BoardGame object
		 */
		
		BoardGame boardgame = new BoardGame();
		
		//adds players to boardGame
		System.out.println("List of Players that are added to the BoardGame:");
		System.out.println(boardgame.addPlayer("Bhaven", GamePiece.BLUE_BOOT, Location.KITCHEN));
		System.out.println(boardgame.addPlayer("Eid", GamePiece.GREEN_BOOT, Location.STUDY));
		System.out.println(boardgame.addPlayer("Jab", GamePiece.BLUE_RACER, Location.HALL));
		System.out.println(boardgame.addPlayer("Mark", GamePiece.BLUE_BOOT, Location.KITCHEN));
		
		// NEw Line 
		System.out.println();
		
		//gets GamePiece using playerName
		System.out.println("GamePiece used by Eid:");
		System.out.println(boardgame.getPlayerGamePiece("Eid"));
		
		//NEw Line
		System.out.println();
		
		//gets playerName using the GamePiece
		System.out.println("users of the Blue Boot game piece:");
		System.out.println(boardgame.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		
		//NEw Line
		System.out.println();
		
		//moves a player to a new location
		System.out.println("Location of where Bhaven moved:");
		boardgame.movePlayer("Bhaven", Location.HALL);
		System.out.println(boardgame.getPlayersLocation("Bhaven"));
		
		//newLine
		System.out.println();
		
		//two new arrays with string and location
		String[] players = {"Mark", "Jab"};
		Location[] locs = {Location.DINING_ROOM, Location.LOUNGE};
		System.out.println("List in which the players got moved:");
		System.out.println(Arrays.toString(boardgame.moveTwoPlayers(players, locs)));
		//NewLine
		System.out.println();
		System.out.println("Location of Mark and Jab:");
		System.out.println(boardgame.getPlayersLocation("Mark"));
		System.out.println(boardgame.getPlayersLocation("Jab"));
		
		//NEw Line
		System.out.println();
		
		//gets location of a player
		System.out.println("Location of Eid:");
		System.out.println(boardgame.getPlayersLocation("Eid"));
		
		//newLine
		System.out.println();
		
		// gets location of all players at a specific location;
		System.out.println("Location of all the players in the boardgame:");
		boardgame.movePlayer("Bhaven", Location.HALL);
		boardgame.movePlayer("Eid", Location.HALL);
		boardgame.movePlayer("Jab", Location.HALL);
		boardgame.movePlayer("Mark", Location.HALL);
		System.out.println(boardgame.getPlayersAtLocation(Location.HALL));
		
		//new Line
		System.out.println();
		
		//gives an arraylist of GamePiece at a specific location
		System.out.println("GamePieces at Hall location:");
		System.out.println(boardgame.getGamePiecesAtLocation(Location.HALL));
		
		//new Line
		System.out.println();
		
		//get all players in the game
		System.out.println("All the players that are in the game:");
		System.out.println(boardgame.getPlayers());
		
		//NEw Line
		System.out.println();
		
		//gets location of all players no duplicats are included
		boardgame.movePlayer("Eid", Location.DINING_ROOM);
		boardgame.movePlayer("Jab", Location.LIBRARY);
		System.out.println("List of all the Location that are being used:");
		System.out.println(boardgame.getPlayerLocations());
		
		//new Line
		System.out.println();
		
		//gets all gamepieces that are being used. no duplicates are included
		System.out.println("List of all the game pieces that are in use:");
		System.out.println(boardgame.getPlayerPieces());
	}

}
