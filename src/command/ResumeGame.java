package command;

import State.GameState;

//Concrete command class
public class ResumeGame implements Command
{
	GameState targetState ;
	
	public ResumeGame(GameState state)
	{
		this.targetState = state ;
	}
	
	public void execute() 
	{
		this.targetState.ResumeGameAction() ;
	}

}