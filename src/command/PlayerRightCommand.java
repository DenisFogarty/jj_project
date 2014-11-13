package command;

import State.GameEngine;
import State.GameState;

//Concrete command class
public class PlayerRightCommand implements Command
{
	GameEngine engine ;
	
	public PlayerRightCommand(GameEngine engine)
	{
		this.engine = engine ;
	}

	public void execute()
	{
		this.engine.getGameState().RightButtonAction() ; 
	}
}
