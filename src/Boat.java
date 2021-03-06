
public class Boat extends Vehicle{
	
	private int speed;
	private Person p = new Captain();

	@Override
	public void run(int spd) {
		speed = spd;
		System.out.println("The boat is going at " + speed + " mph");
	
	}

	@Override
	public void accelerate() {
		
		System.out.println("The boat is accelerating");
		
	}

	@Override
	public void stop() {
		
		if (getSpeed() == 0){
			System.out.println("The boat stopped");
		} else {
			System.out.println("The boat did not stop");	
		}
			
	}
	public int getSpeed() {
		
		return speed;
	}

	public void setSpeed(int speed) {
		
		this.speed = speed;
	}
	
	public void drivenBy(){
		
		p.setName("Mark");
		System.out.println("Captain " + p.getName() + "  is driving the boat " );
	}


}
