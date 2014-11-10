package State;

import factory.ChangeManager;
import factory.Enemy;
import factory.GameObjectfactory;
import factory.Player;

public class Start implements GameState
{
	public void stateOfGame() 
	{		
		GameObjectfactory gof = new GameObjectfactory() ;
		ChangeManager change = new ChangeManager();
		Enemy gameo =(Enemy) gof.createGameobject("enemy","Enemy1",200,45,23,change) ;
		Player gameo2 =(Player) gof.createGameobject("player","Playa",200,0,56,change) ;
		
		System.out.println(gameo.toString()) ;
		System.out.println(gameo2.toString());
		
		gameo2.attach(gameo) ;
		
		System.out.print("The game has started \n") ;
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

	@Override
	public void OffGameAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ResumeGameAction() {
		// TODO Auto-generated method stub
		
	}
}