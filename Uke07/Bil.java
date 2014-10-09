
public class Bil {
	
	private String modell;
	private int tankvolum;
	
	// Dette er konstruktoren
	Bil(String mod, int tank){
		modell = mod;
		tankvolum = tank;
	}
	
	// Her er klassens toString-metode
	public String toString(){	
		return modell + " " + tankvolum;
	}
}