package factory;

public class GameObjectfactory extends AbstractFactory {

	GameObject G_object ;
	
	public GameObjectfactory()
	{
		
	}
	public GameObject createGameobject(String type,String name,int health,int x,int y,ChangeManager changemanager)
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
}
