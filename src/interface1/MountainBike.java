package interface1;

class MountainBike implements bicycle {
	@Override
	public void applyBrake(int decrement) {
		speed -=decrement;
	
		
	}



	@Override
	public void speedUp(int increment) {
		speed -=increment;
		 
		
	}



	private int seatHight;
	private int gear;
	private int  speed;
	
	

	public MountainBike(int startHight,int startGear,int startspeed) {
		
		
		seatHight = startHight;
		gear =  startGear; 
		speed = startspeed;
		
		
		
		
	
		
		
	}



	public int getSeatHight() {
		return seatHight;
	}



	public void setSeatHight(int seatHight) {
		this.seatHight = seatHight;
	}



	public int getGear() {
		return gear;
	}



	public void setGear(int gear) {
		this.gear = gear;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
