package State;

public class Start implements GameState
{
	GameEngine engine ;
	
	public Start(GameEngine gameEngine)
	{
		this.engine = gameEngine ;
	}
	
	
	public void stateOfGame() 
	{		
		
		engine.startgame(true);
		System.out.print("The game has started \n") ;
	}

	@Override
	public void leftButtonAction() {
		// TODO Auto-generated method stub
		engine.movePlayerL();

	}

	@Override
	public void RightButtonAction() {
		// TODO Auto-generated method stub
		engine.movePlayerR();

	}

	@Override
	public void PauseGameAction() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void OffGameAction() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ResumeGameAction() {
		// TODO Auto-generated method stub
		
	}
}