package State;
public class Pause implements GameState
{
	public void stateOfGame() 
	{
		System.out.print("The game has been paused \n") ;		
	}

	@Override
	public void leftButtonAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RightButtonAction() {
		// TODO Auto-generated method stub
		
	}

	public void PauseGameAction() 
	{
		System.out.print("The game cannot change state \n") ;
	}

	public void OffGameAction() 
	{
		
	}

	@Override
	public void ResumeGameAction() {
		// TODO Auto-generated method stub
		
	}
}
