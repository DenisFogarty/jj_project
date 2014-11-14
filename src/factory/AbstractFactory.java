package factory;

import observer.ChangeManager;

public abstract class AbstractFactory {

	public abstract I_enemy createEnemy(String type,String name,int x,int y,ChangeManager changemanager);
	public abstract GameEntity createGameobject(String type,String name,int health,int x,int y,ChangeManager changemanager);
	public abstract I_GameWorld_Object createGameWorldobject(String type,String id,int x,int y,int width,int height) ;
}
