
public class Car extends Vehicle {

	private int speed;
	
	public void run(int spd) {
		speed = spd;
		System.out.println("The car is going at " + speed + " mph");
	
	}

	@Override
	public void accelerate() {
		
		System.out.println("The car is accelerating");
	}

	@Override
	public void stop() {
		System.out.println("The car stopped");
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
