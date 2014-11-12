package command;

import State.GameState;

//Concrete class
public class PlayerLeft implements Command
{
	GameState targetState ;
	
	public PlayerLeft(GameState state)
	{
		this.targetState = state ;
	}

	public void execute()
	{
		this.targetState.leftButtonAction(); ; 
	}
}
