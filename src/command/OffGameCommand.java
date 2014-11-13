package command;

import State.GameEngine;
import State.GameState;
import State.OffState;

//Concrete command class. different to other command classes as the command get actually executed in this class
public class OffGameCommand implements Command
{
	GameEngine engine ;
	
	public OffGameCommand(GameEngine engine)
	{
		this.engine = engine ;
	}

	public void execute()
	{
		engine.setGameState(new OffState());
	}
}