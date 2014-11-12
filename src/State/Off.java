package State;

import factory.I_Player;

public class Off implements GameState
{
	public void stateOfGame()
	{
		System.out.print("The game is off \n") ;
	}

	@Override
	public void leftButtonAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RightButtonAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PauseGameAction() {
		// TODO Auto-generated method stub
		
	}

	public void OffGameAction(I_Player player) 
	{
	}

	@Override
	public void ResumeGameAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OffGameAction() {
		// TODO Auto-generated method stub
		
	}
}
