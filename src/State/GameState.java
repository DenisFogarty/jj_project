package State;

import java.util.List;

import Flyweight.I_enemy;
import factory.I_Player;
import factory.Level;

public interface GameState 
{
	public void stateOfGame() ;
	public void leftButtonAction() ;
	public void RightButtonAction();
	public void PauseGameAction() ;
	public void OffGameAction() ;
	public void ResumeGameAction() ;
}
