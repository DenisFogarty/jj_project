package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChangeManager {

	private HashMap<I_Subject,List<I_Observer>> hash ;

	public ChangeManager() 
	{
		this.hash = new HashMap<I_Subject,List<I_Observer>>() ;
	}

	public void register(I_Subject sub ,I_Observer observer )
	{
		if(hash.containsKey(sub))
		{ 


			if(hash.get(sub).contains(observer)==false)
			{
				hash.get(sub).add(observer) ;
			}
			//hash.containsValue(observers.get(0));
		}
		else 
		{
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
			ArrayList<I_Observer> ob =  (ArrayList<I_Observer>) hash.get(sub) ;	
			for(int i = 0 ; i < ob.size();i++)
			{
				I_Subject a = (I_Subject)(ob.get(i));//a is observer cast to subject 
				if( hash.get(a)!=null)
				{
					if( hash.get(a).contains((I_Observer)sub)==true)//looks for the subject which is cast to a observer

					{
						index =hash.get(a).indexOf((I_Observer)sub);
						//I_Observer obba=
						((GameObject)(this.hash.get(a).get(index))).setCoordinates(((GameObject)sub).getxCoord(), ((GameObject)sub).getyCoord());
						//	((GameObject)obba).setCoordinates(((GameObject)sub).getxCoord(), ((GameObject)sub).getyCoord());

						System.out.println(((GameObject)sub).getname() + " updates in "+((GameObject)a).getname()  );
					}
				}
			}
		}
	}
}

