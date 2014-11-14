package factory;

import observer.ChangeManager;

public class GameEntityfactory extends AbstractFactory {

	GameEntity G_object ;
	
	public GameEntityfactory()
	{
		
	}
	public GameEntity createGameobject(String type,String name,int health,int x,int y,ChangeManager changemanager)
	{
		if(type == "player")
		{
			System.out.println("Player Object created" + x + " " + y+ " ");
			return new Player(name,health,x,y,changemanager);
		}
		return null ;
	}
	@Override
	public Enemy createEnemy(String type, String name, int x, int y,
			ChangeManager changemanager) {
		
		return null;
	}
	@Override
	public I_GameWorld_Object createGameWorldobject(String type, String id,
			int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		return null;
	}
}
