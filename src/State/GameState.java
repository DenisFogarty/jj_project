package State;

import java.util.List;

import factory.I_Player;
import factory.I_enemy;
import factory.Level;

public interface GameState 
{
	public void stateOfGame(I_Player play,Level lev,List<I_enemy> enemyList) ;
	public void leftButtonAction(I_Player play) ;
	public void RightButtonAction(I_Player play);
	public void PauseGameAction(I_Player player) ;
	public void OffGameAction(I_Player player) ;
	public void ResumeGameAction(I_Player player) ;
}
