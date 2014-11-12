package command;

import State.GameEngine;
import State.GameState;

//Concrete command class
public class PauseGame implements Command
{
	GameEngine engine ;
	
	public PauseGame(GameEngine engine)
	{
		this.engine = engine ;
	}
	
	public void execute() 
	{
		this.engine.getGameState().PauseGameAction() ;
	}

}
