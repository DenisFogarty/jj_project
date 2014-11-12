package command;

import State.GameEngine;
import State.GameState;

//Concrete class
public class PlayerLeft implements Command
{
	GameEngine engine ;
	
	public PlayerLeft(GameEngine engine)
	{
		this.engine = engine ;
	}

	public void execute()
	{
		this.engine.getGameState().leftButtonAction(); ; 
	}
}
