package observer;


	public interface I_ChangeManager {
		
		public void register(I_Subject sub ,I_Observer observer ) ;
		public void unregister(I_Subject sub ,I_Observer observer );
		public void update(I_Subject sub);

		


	}


