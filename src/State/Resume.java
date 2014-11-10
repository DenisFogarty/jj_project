package State;
public class Resume implements GameState
{
	public void stateOfGame() 
	{
		System.out.print("The game has resumed \n") ;		
	}

	public void leftButtonAction()
	{
		System.out.print("Player moves left \n") ;
	}

	public void RightButtonAction() 
	{
		System.out.print("Player moves right \ns") ;
	}

	public void PauseGameAction() 
	{
	}

	public void OffGameAction()
	{
	}

	public void ResumeGameAction() 
	{
	}
}
