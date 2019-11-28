package Observer;

public interface Subject {
	void regisOb(Observer s);
	void removeOb(Observer s);
	void notifyOb();
	
	/*public void registerOb(Observer o);
	public void removeOb(Observer o);
	public void notifyOb();*/	
}
