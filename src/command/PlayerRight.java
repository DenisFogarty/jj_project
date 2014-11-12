package command;

import State.GameEngine;
import State.GameState;

//Concrete class
public class PlayerRight implements Command
{
	GameEngine engine ;
	
	public PlayerRight(GameEngine engine)
	{
		this.engine = engine ;
	}

	public void execute()
	{
		this.engine.getGameState().RightButtonAction() ; 
	}
}
