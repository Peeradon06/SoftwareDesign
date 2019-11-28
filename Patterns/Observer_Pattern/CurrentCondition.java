package Observer;

public class CurrentCondition implements Observer, DisplayElement {

	@Override
	public void update(float t, float h, float p) {
		// TODO Auto-generated method stub
		
	}
	/*private float temp,humidity;
	private Subject weatherData;
	public CurrentCondition(Subject Weather) {
		this.weatherData = Weather;
		weatherData.registerOb(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Temp : "+this.temp+" Current Humidity : "+this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temp = temp;
		display();
	}*/

}
