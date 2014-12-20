package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Flyweight.GameEntity;

public class ChangeManager implements I_ChangeManager {

	private HashMap<I_Subject,List<I_Observer>> hash ;

	public ChangeManager() 
	{
		this.hash = new HashMap<I_Subject,List<I_Observer>>() ;
	}


	public void register(I_Subject sub ,I_Observer observer )
	{
		//method adds the observer to the to the Subjects entry in the hashmap
		if(hash.containsKey(sub))
		{ 


			if(hash.get(sub).contains(observer)==false)
			{
				//not present ..added to subjects entry in Hashmap
				hash.get(sub).add(observer) ;
			}
			//hash.containsValue(observers.get(0));
		}
		else 
		{
			//new entry created for subject and the observer is added to its list
			ArrayList<I_Observer>Olist = new ArrayList<I_Observer>() ;
			Olist.add(observer) ;
			hash.put(sub,Olist) ;
		}
	}

	public void update(I_Subject sub)
	{
		int index ;
		if(hash.containsKey(sub))
		{

			ArrayList<I_Observer> ob =  (ArrayList<I_Observer>) hash.get(sub) ;	//observer list from hashmap 
			for(int i = 0 ; i < ob.size();i++)
			{
				//the entry i of the observer list will search for the Subject in its own entry in the hashmap
				//essentially the observer becomes a subject..searches for itself as a key in the hasmap.
				//if found it searchs for Subject sub(parameter) in its observer list and updates its information 
				I_Subject a = (I_Subject)(ob.get(i));//a is observer cast to subject 
				if( hash.get(a)!=null)
				{
					if( hash.get(a).contains((I_Observer)sub)==true)//looks for the subject which is cast to a observer

					{
						index =hash.get(a).indexOf((I_Observer)sub);

						((GameEntity)(this.hash.get(a).get(index))).setCoordinates(((GameEntity)sub).getxCoord(), ((GameEntity)sub).getyCoord());
						//updating coordinates
						System.out.println(((GameEntity)sub).getname() + " updates in "+((GameEntity)a).getname()  );
					}
				}
			}
		}
	}


	@Override
	public void unregister(I_Subject sub, I_Observer observer) {
		//detaches Observer from a Subject
		if(hash.containsKey(sub))
		{
			if(hash.get(sub).contains(observer)==true)
			{
				hash.get(sub).remove(observer) ;
			}
		}
	}
}

