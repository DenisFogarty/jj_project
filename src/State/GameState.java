package State;

import java.util.List;

import factory.I_Player;
import factory.I_enemy;
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
