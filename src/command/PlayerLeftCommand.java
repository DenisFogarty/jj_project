package command;

import State.GameEngine;
import State.GameState;

//Concrete command class
public class PlayerLeftCommand implements Command
{
	GameEngine engine ;
	
	public PlayerLeftCommand(GameEngine engine)
	{
		this.engine = engine ;
	}

	public void execute()
	{
		this.engine.getGameState().leftButtonAction(); ; 
	}
}
