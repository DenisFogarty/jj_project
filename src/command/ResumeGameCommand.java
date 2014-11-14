package command;

import State.GameEngine;
import State.GameState;

//Concrete command class
public class ResumeGameCommand implements Command
{
	GameEngine engine ;
	
	public ResumeGameCommand(GameEngine engine)
	{
		this.engine = engine ;
	}
	
	public void execute() 
	{
		this.engine.getGameState().ResumeGameAction() ;
	}

}