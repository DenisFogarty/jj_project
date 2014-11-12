package command;

import State.GameEngine;
import State.GameState;
import State.Off;

//Concrete class
public class OffGame implements Command
{
	GameEngine engine ;
	
	public OffGame(GameEngine engine)
	{
		this.engine = engine ;
	}

	public void execute()
	{
		engine.setGameState(new Off());
	}
}