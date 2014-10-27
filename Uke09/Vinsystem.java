import java.util.*;
import java.io.File;

public class Vinsystem {
	
	static HashMap<String, Vin> vinliste = new HashMap<String, Vin>();

	public static void main(String[] args) throws Exception{
		lesVin();
		
		for(Vin v : vinliste.values()){	
			System.out.println(v);
		}
	}
	
	public static void lesVin() throws Exception {
		File fil = new File("vinliste.txt");
		Scanner sc = new Scanner(fil);
		
		while(sc.hasNextLine()){
			String linje = sc.nextLine();
			String[] ord = linje.split("\\s+");
			int endNavn = ord.length-3;
			
			String navn = "";
			for(int i = 1; i < endNavn; i++){
				navn = navn + ord[i] + " ";
			}
			navn = navn.trim();	//Tar bort siste mellomrom
			
			int nummer = Integer.parseInt(ord[0]);
			int aargang = Integer.parseInt(ord[endNavn]);
			int poeng = Integer.parseInt(ord[endNavn+1]);
			int pris = Integer.parseInt(ord[endNavn+2].substring(1));
			
			Vin v = new Vin(nummer, navn, aargang, poeng, pris);
			vinliste.put(navn, v);
		}
	}
}





