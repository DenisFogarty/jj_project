package command;

import State.GameEngine;
import State.GameState;

//Concrete command class. calls the appropriate pause game action depending on the current state
public class PauseGameCommand implements Command
{
	GameEngine engine ;
	
	public PauseGameCommand(GameEngine engine)
	{
		this.engine = engine ;
	}
	
	public void execute()
	{
		this.engine.getGameState().PauseGameAction() ;
	}
}
