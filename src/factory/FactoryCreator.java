package factory;


public class FactoryCreator {
	//String pattern = ".*enemy" ;
	   public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("player")){
	         return new GameObjectfactory();
	      } else if(choice.matches(".*enemy")){
	         return new GameEnemyFactory();
	      }
	      return null;
	   }
	}