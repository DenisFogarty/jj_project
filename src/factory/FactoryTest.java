package factory;

public class FactoryTest {

	public static void main(String[] args)
	{

		ChangeManager change = new ChangeManager();

		Enemy enemy = FactoryCreator.getFactory("regular enemy").createEnemy("regular enemy", "Bob", 50, 25, change);


		Enemy enemy2 = FactoryCreator.getFactory("small enemy").createEnemy("small enemy", "George", 75, 30, change);

		System.out.println();

		System.out.println();
		Player gameo2 =(Player) FactoryCreator.getFactory("player").createGameobject("player","Playa",200,0,56,change) ;

		gameo2.attach(enemy) ;
		gameo2.attach(enemy2) ;
		enemy.attach(gameo2) ;
		enemy2.attach(gameo2) ;
		gameo2.move();
		System.out.println(gameo2.toString());


	}

}
