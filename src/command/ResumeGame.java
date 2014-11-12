package command;

import State.GameEngine;
import State.GameState;

//Concrete command class
public class ResumeGame implements Command
{
	GameEngine engine ;
	
	public ResumeGame(GameEngine engine)
	{
		this.engine = engine ;
	}
	
	public void execute() 
	{
		this.engine.getGameState().ResumeGameAction() ;
	}

}