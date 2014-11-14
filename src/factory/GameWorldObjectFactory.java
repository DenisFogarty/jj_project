package factory;

import observer.ChangeManager;

public class GameWorldObjectFactory extends AbstractFactory {

	I_GameWorld_Object worldobject ;
	
	public GameWorldObjectFactory() {
		
	}
	
	public I_GameWorld_Object createGameWorldobject(String type,String id,int x,int y,int width,int height)
	{
		if(type.matches( "obstacle.*"))  //dog/
		{
			System.out.println("Obstacle created in GameworldObjectFactory at " + x + " " + y+ " ");
			return new Obstacle(id,x,y,width,height);
		}
		return null ;
	}

	@Override
	public I_enemy createEnemy(String type, String name, int x, int y,
			ChangeManager changemanager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameEntity createGameobject(String type, String name, int health,
			int x, int y, ChangeManager changemanager) {
		// TODO Auto-generated method stub
		return null;
	}
}
