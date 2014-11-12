package State;
public class GameMachine
{	
	GameState gameState ;
	
	public GameMachine()
	{		
		gameState = new Start(null) ;
	}
	
	public void setGameState(GameState gs)
	{
		gameState = gs ;
	}
	
	public GameState getGameState()
	{
		return gameState;
	}
}
