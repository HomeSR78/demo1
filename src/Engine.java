
public class Engine {
	
public Engine(TYPE type) {
		super();
		this.type = type;
	}

public enum TYPE {
	PETROL,DIESEL;
	
	
}
	
TYPE   type;

public void  start() {
	
	System.out.println("Engine started");
	
}





}
