package observer;


public interface I_Subject {

	public void attach(I_Observer observer);
	public void detach(I_Observer observer);
	public void notifyobservers() ;
}
