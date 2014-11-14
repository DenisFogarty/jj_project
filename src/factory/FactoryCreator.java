package factory;



public class FactoryCreator {
	//String pattern = ".*enemy" ;
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("player")){
			return new GameEntityfactory();
		} else if(choice.matches(".*enemy")){
			return new GameEnemyFactory();
		}else if(choice.matches(".*world object")){
			return new GameWorldObjectFactory();
		}
		return null;
	}
}