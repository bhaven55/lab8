import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest 
{

	@Test
	public void BoardGame()
	{
		BoardGame game = new BoardGame();
		int answer1 = game.playerPieces.size();
		int expected1 = 0;
		int answer2 = game.playerLocations.size();
		int expected2 = 0;
		
		Assert.assertEquals("The constructor for BoardGame is not working", expected1, answer1);
		Assert.assertEquals("The constructor for BoardGame is not working", expected2, answer2);
	}
	
	@Test
	public void addPlayer()
	{
		BoardGame game = new BoardGame();
		boolean answer = game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		boolean answer2 = game.addPlayer("Eid", GamePiece.RED_RACER, Location.HALL);
		
		Assert.assertEquals("addPlayer method for BoardGame is not working", true, answer);
		Assert.assertEquals("The answer is suppose to be false", false, answer2);
	}
	
	@Test
	public void getPlayerGamePiece()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		GamePiece answer = game.getPlayerGamePiece("Bhaven");
		
		Assert.assertEquals("getPlayerGamePiece method for BoardGame is not working", GamePiece.RED_RACER, answer);
	}
	
	@Test
	public void getPlayerWithGamePiece()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_RACER, Location.STUDY);
		String answer = game.getPlayerWithGamePiece(GamePiece.RED_RACER);
		
		Assert.assertEquals("The answer is suppose to be Bhaven ", "Bhaven", answer);
	}
	
	@Test
	public void movePlayer()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.movePlayer("Bhaven", Location.STUDY);
		Location answer = game.getPlayersLocation("Bhaven");
		
		Assert.assertEquals("movePlayer method for BoardGame is not working", Location.STUDY, answer);
	}
	
	@Test
	public void moveTwoPlayers()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.BLUE_BOOT, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_RACER, Location.STUDY);
		game.addPlayer("Jab", GamePiece.GREEN_BOOT, Location.LIBRARY);
		String[] players = {"Bhaven", "Eid"};
		Location[] locations = {Location.STUDY, Location.DINING_ROOM};
		String[] movingOrder = game.moveTwoPlayers(players, locations);
		
		String[] players1 = {"Bhaven", "Jab"};
		Location[] locations1 = {Location.LOUNGE, Location.KITCHEN};
		String[] movingOrder1 = game.moveTwoPlayers(players1, locations1);
		
		Assert.assertEquals("moveTwoPlayers method for BoardGame is not working","[Eid, Bhaven]", Arrays.toString(movingOrder));
		Assert.assertEquals("moveTwoPlayers method for BoardGame is not working","[Bhaven, Jab]", Arrays.toString(movingOrder1));
	}
	
	@Test
	public void getPlayerLocation()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		Location answer = game.getPlayersLocation("Bhaven");
		
		Assert.assertEquals("getPlayerLocation for BoardGame is not working", Location.HALL, answer);
	}
	
	@Test
	public void getPlayersAtLocation()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_BOOT, Location.HALL);
		game.addPlayer("Jab", GamePiece.BLUE_RACER, Location.HALL);
		
		ArrayList<String> players = game.getPlayersAtLocation(Location.HALL);
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Bhaven");
		expected.add("Eid");
		expected.add("Jab");
		
		Assert.assertEquals("getPlayersAtLocation method is not working", expected, players);
	}
	
	@Test
	public void getGamePieceAtLocation()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_BOOT, Location.HALL);
		game.addPlayer("Jab", GamePiece.BLUE_RACER, Location.HALL);
		
		ArrayList<GamePiece> answer = game.getGamePiecesAtLocation(Location.HALL);
		ArrayList<GamePiece> expected = new ArrayList<GamePiece>();
		expected.add(GamePiece.RED_RACER);
		expected.add(GamePiece.BLUE_BOOT);
		expected.add(GamePiece.BLUE_RACER);
		
		Assert.assertEquals("getGamePiecesAtLocation method for BoardGame is not working", expected, answer);
	}
	
	@Test
	public void getPlayers()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_BOOT, Location.HALL);
		game.addPlayer("Jab", GamePiece.BLUE_RACER, Location.HALL);
		
		Set<String> answer = game.getPlayers(); 
		Set<String> expected = new HashSet<String>();
		expected.add("Bhaven");
		expected.add("Eid");
		expected.add("Jab");
		
		Assert.assertEquals("getPlayers method for BoardGame is not working", expected, answer);
	}
	
	@Test
	public void getPlayerLocations()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_BOOT, Location.STUDY);
		game.addPlayer("Jab", GamePiece.BLUE_RACER, Location.KITCHEN);
		
		Set<Location> answer = game.getPlayerLocations();
		Set<Location> expected = new HashSet<Location>();
		expected.add(Location.HALL);
		expected.add(Location.STUDY);
		expected.add(Location.KITCHEN);
		
		Assert.assertEquals("getPlayerLocations method for BoardGame is not working", expected, answer);
	}
	
	@Test
	public void getPlayerPieces()
	{
		BoardGame game = new BoardGame();
		game.addPlayer("Bhaven", GamePiece.RED_RACER, Location.HALL);
		game.addPlayer("Eid", GamePiece.BLUE_BOOT, Location.STUDY);
		game.addPlayer("Jab", GamePiece.BLUE_RACER, Location.KITCHEN);
		
		Set<GamePiece> answer = game.getPlayerPieces();
		Set<GamePiece> expected = new HashSet<GamePiece>();
		expected.add(GamePiece.RED_RACER);
		expected.add(GamePiece.BLUE_BOOT);
		expected.add(GamePiece.BLUE_RACER);
		
		Assert.assertEquals("getPlayerPieces method for BoardGame is not working", expected, answer);
	}
}
