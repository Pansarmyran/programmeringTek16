package classes.lesson;

public class Car {
	private String motor = "";
	private int bromsV�rde = 0;
	private int antalD�ck = 4;
	private String bilM�rke = "";
	private int maxHastighet;
	private int hastighet = 0;
	
	public Car(String newMotor, String newBilM�rke) {
		motor = newMotor;
		bilM�rke = newBilM�rke;
	}
	
	public void setSpeed(int newHastighet) {
		hastighet = newHastighet;
	}
	
	public int getSpeed() {
		return hastighet;
	}
	

}
