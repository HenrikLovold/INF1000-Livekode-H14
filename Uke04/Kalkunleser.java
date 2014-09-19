import java.util.Scanner;
import java.io.File;

class Kalkunleser {

	public static void main(String[] args) throws Exception{
		String filnavn = "tekstfil.txt";	//Filnavn
		File fil = new File(filnavn);		//Oppretter kobling til
		Scanner sc = new Scanner(fil);		//Lager scanner
		
		int teller = 0;						//Teller (starter på 0)
		
		while(sc.hasNextLine()){			//Mens det fortsatt kan leses...
			String linje = sc.nextLine();	//Les neste linje og husk ord
			
			if(!linje.equals("kalkun")){	//Hvis ordet IKKE er "kalkun"...
				teller++;					//Øk telleren med 1
			}
		}
		
		System.out.println("Antall linjer uten kalkun: " + teller);
			
	}
	
}