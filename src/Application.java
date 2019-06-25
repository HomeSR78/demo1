import java.awt.Color;

public class Application {

	public static void main(String[] args) {
		Engine e1 = new Engine(Engine.TYPE.PETROL);
		
		Car c1 = new Car(Color.white,(short) 5,e1);
		c1.carStart();
		
	}
}
