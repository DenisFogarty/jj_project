package factory;

public abstract class AbstractFactory {

	public abstract Enemy createEnemy(String type,String name,int x,int y,ChangeManager changemanager);
	public abstract GameObject createGameobject(String type,String name,int health,int x,int y,ChangeManager changemanager);
	
}
