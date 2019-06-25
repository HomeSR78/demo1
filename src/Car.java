import java.awt.Color;

public class Car {
	
	private Color   color;
	private short capacity ; //pax capacity ,immutable property
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(Color color, short capacity,Engine engine) {
		super();
		this.color = color;
		this.capacity = capacity;
		this.engine = engine;
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public short getCapacity() {
		return capacity;
	}

	
public void carStart() {
	
	engine.start();
	
	//boolean returnState = false;
	
	//return returnState;
	
	
	
}

}
