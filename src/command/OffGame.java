package command;

import State.GameState;

//Concrete class
public class OffGame implements Command
{
	GameState targetState ;
	
	public OffGame(GameState state)
	{
		this.targetState = state ;
	}

	public void execute()
	{
		this.targetState.OffGameAction(); ; 
	}
}