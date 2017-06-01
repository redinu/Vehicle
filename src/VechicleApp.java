
public class VechicleApp {

	public static void main(String[] args) {
		
		Plane p = new Plane();
		
		p.run(50);
		p.setSpeed(250);
		p.accelerate();
		p.setSpeed(0);
		p.stop();
		
		Boat b = new Boat();
		
		b.run(10);
		b.setSpeed(15);
		b.accelerate();
		b.setSpeed(0);
		b.stop();
		
		Car c = new Car();
		c.run(30);
		c.setSpeed(0);
		c.stop();
	}

}
