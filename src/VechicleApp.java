
public class VechicleApp {

	public static void main(String[] args) {
		
		Plane p = new Plane();
		
		p.run(50);
		p.setSpeed(250);
		p.accelerate();
		p.setSpeed(0);
		p.stop();
		p.flownBy();
		
		System.out.println();
		
		Boat b = new Boat();
		
		b.run(10);
		b.setSpeed(15);
		b.accelerate();
		b.setSpeed(0);
		b.stop();
		b.drivenBy();
		
		System.out.println();
		
		Car c = new Car();
		c.run(30);
		c.setSpeed(0);
		c.stop();
		c.drivenBy();
		
		
	}

}
