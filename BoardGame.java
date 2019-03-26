import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BoardGame 
{
	//protected fields of BoardGame
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	/**
	 * Constructor for the BoardGame
	 */
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	/**
	 * Adds a player to the board game object.
	 * 
	 * @param playerName
	 * @param gamePiece
	 * @param intialLocation
	 * @return false if there already is a player associated with the game piece.
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation)
	{
		if(playerPieces.containsKey(playerName) || playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		else
		{
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, intialLocation);
			return true;
		}
	}
	
	/**
	 * Given a player's name, find the game piece associated with that player.
	 * 
	 * @param playerName
	 * @return The game piece associated with the player.
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	/**
	 * Given a game piece, find the player associated with that game piece.
	 * 
	 * @param gamePiece
	 * @return If a player is correlated with the game piece, return that player name.Else, return null.
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		// FIXME
		Set<Map.Entry<String, GamePiece>> entrySet = playerPieces.entrySet();
		Iterator<Map.Entry<String, GamePiece>> it = entrySet.iterator();
		String results = null;
		while(it.hasNext())
		{
			Map.Entry<String, GamePiece> entry = (Map.Entry<String, GamePiece>) it.next();
			if(entry.getValue().toString().equals(gamePiece.toString()))
			{
				results = entry.getKey();
			}
		}
		
		return results;
	}
	
	/**
	 * Moves a player to a new location in the board game. 
	 * 
	 * @param playerName
	 * @param newLocation
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.put(playerName, newLocation);
	}
	
	/**
	 * Method to use when two players each want to move at the same time.
	 * 
	 * @param playerNames
	 * @param newLocations
	 * @return The players, sorted in the order in which the two players move 
	 * 		   (the first player to move is at index 0 of the returned array).
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		
		String[] playerList = new String[2];
		
		String Name1 = playerNames[0];
		String Name2 = playerNames[1];
		
		GamePiece player1 = playerPieces.get(Name1);
		GamePiece player2 = playerPieces.get(Name2);
		
		GamePiece results = GamePiece.movesFirst(player1, player2);
		
		if(results.toString().equals(player1.toString()))
		{
			playerList[0] = Name1;
			this.movePlayer(Name1, newLocations[0]);
		}
		else
		{
			playerList[0] = Name2;
			this.movePlayer(Name2, newLocations[1]);
		}
		
		if(playerList[0].equals(Name1))
		{
			playerList[1] = Name2;
			this.movePlayer(Name2, newLocations[1]);
		}
		else
		{
			playerList[1] = Name1;
			this.movePlayer(Name1, newLocations[0]);
		}
		
		return playerList;
	}
	
	/**
	 * Gets the location of a player.
	 * 
	 * @param player
	 * @return The location of the player.
	 */
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	/**
	 * Given a location, find all players at that location.
	 * 
	 * @param loc
	 * @return The players at the given location.
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		//FIXME
		ArrayList<String> results = new ArrayList<String>();
		Set<Map.Entry<String, Location>> set = playerLocations.entrySet();
		Iterator<Map.Entry<String, Location>> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<String, Location> entry = iterator.next();
			Location location = entry.getValue();
			if(location == loc)
			{
				results.add(entry.getKey());
			}
		}
		return results;
	}
	
	/**
	 * Given a location, find the game pieces associated with all the players at that location.
	 * 
	 * @param loc
	 * @return The game pieces for which an associated player is at the given location.
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> gamePieces = new ArrayList<GamePiece>();
		ArrayList<String> players = new ArrayList<String>();
		Set<Map.Entry<String, Location>> set = playerLocations.entrySet();
		Iterator<Map.Entry<String, Location>> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<String, Location> entry = iterator.next();
			Location location = entry.getValue();
			if(location == loc)
			{
				players.add(entry.getKey());
			}
		}
		
		for(int i = 0; i < players.size(); ++i)
		{
			gamePieces.add(playerPieces.get(players.get(i)));
		}
		return gamePieces;
	}
	
	/**
	 * Gets all players recorded in the game.
	 * 
	 * @return The list of players in the board game.
	 */
	public Set<String> getPlayers()
	{
		Set<String> results = new HashSet<String>();
		Set<Map.Entry<String, GamePiece>> set = playerPieces.entrySet();
		Iterator<Map.Entry<String, GamePiece>> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<String, GamePiece> entry = iterator.next();
			results.add(entry.getKey());
		}
		return results;
	}
	
	/**
	 * Gets all locations that the players are at (not all possible locations).
	 * 
	 * @return The set of locations (i.e. no duplicate elements) at which at least one player is present.
	 */
	public Set<Location> getPlayerLocations()
	{
		Set<Location> results = new HashSet<Location>();
		Set<Map.Entry<String, Location>> set = playerLocations.entrySet();
		Iterator<Map.Entry<String, Location>> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<String, Location> entry = iterator.next();
			Location location = entry.getValue();
			if(!(results.contains(location)))
			{
				results.add(location);
			}
		}
		return results;
	}
	
	/**
	 * Gets all game pieces associated with the players (not all possible game pieces).
	 * 
	 * @return The set of game pieces 
	 */
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> results = new HashSet<GamePiece>();
		Set<Map.Entry<String, GamePiece>> set = playerPieces.entrySet();
		Iterator<Map.Entry<String, GamePiece>> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<String, GamePiece> entry = iterator.next();
			GamePiece gamePiece = entry.getValue();
			if(!(results.contains(gamePiece)))
			{
				results.add(gamePiece);
			}
		}
		return results;
	}
}
