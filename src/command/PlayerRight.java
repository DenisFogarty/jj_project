package command;

import State.GameState;

//Concrete class
public class PlayerRight implements Command
{
	GameState targetState ;
	
	public PlayerRight(GameState state)
	{
		this.targetState = state ;
	}

	public void execute()
	{
		this.targetState.RightButtonAction(); ; 
	}
}
