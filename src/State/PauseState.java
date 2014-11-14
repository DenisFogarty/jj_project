package State;


public class PauseState implements GameState
{
	
	private GameEngine engine ;
	public PauseState(GameEngine gameEngine) {
		this.engine = gameEngine ;
	}

	//called when a pause state is created
	public void stateOfGame() 
	{
		engine.startgame(false);
		System.out.print("The game has paused \n") ;		
	}

	@Override
	public void leftButtonAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RightButtonAction() {
		// TODO Auto-generated method stub
		System.out.print("Game paused, cannot move \n");
	}

	//is called when already in pause state
	public void PauseGameAction() 
	{
		System.out.print("The game cannot change state \n") ;
	}

	public void OffGameAction() 
	{
		
	}

	//sets to resume state
	public void ResumeGameAction() 
	{
		engine.setGameState(new ResumeState(engine));
		System.out.print("The game has resumed \n") ;	
	}
}
