
public class Plane extends Vehicle{
	
	public Plane(){
		
	}
	
	public Plane(int speed){
		
	}
	
	private int speed;

	public void run(int spd) {
		speed = spd;
		System.out.println("The plane is going at " + speed + " mph");
	}

	
	public void accelerate() {
		
		System.out.println("The Plane is accelerating");
	}

	public void stop() {
		
		if (getSpeed() == 0)
		
		System.out.println("The plane stopped");
		
	}
	
	public void fly(){
		
		System.out.println("The plane is flying");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	

}
