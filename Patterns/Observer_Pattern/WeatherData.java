package Observer;
import java.util.*;

public class WeatherData implements Subject {
	private float temp,hum,press;
	private ArrayList<Observer>observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	@Override
	public void regisOb(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeOb(Observer o) {
		int i = observers.indexOf(o);
		if(i>0) {
			observers.remove(i);
		}
	}
	@Override
	public void notifyOb() {
		for(int i=0;i<observers.size();i++) {
			Observer observer = observers.get(i);
			observer.update(temp, hum, press);
		}
	}
	
	public void setMeasure(float t,float h,float p) {
		this.temp = t;
		this.hum = h;
		this.press = p;
		notifyOb();
	}
	
	/*private float temp,humidity,pressure;
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerOb(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeOb(Observer o) {
		int i = observers.indexOf(o);
		if(i>0) {
			observers.remove(i);
		}
	}
	@Override
	public void notifyOb() {
		for(int i = 0 ;i<observers.size();i++) {
			Observer observer = observers.get(i);
			observer.update(temp, humidity, pressure);
		}

	}
	
	public void measureChange() {
		notifyOb();
	}
	public void setMeasure(float t,float h,float p) {
		this.temp = t;
		this.humidity = h;
		this.pressure = p;
		notifyOb();
	}*/

}
