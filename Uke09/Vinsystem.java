import java.util.*;
import java.io.*;

public class Vinsystem {

	static HashMap<String, Vin> vinliste = new HashMap<String, Vin>();

	public static void main(String[] args) throws Exception{
		lesVin();
<<<<<<< HEAD

		for(Vin v : vinliste.values()){
			System.out.println(v);
		}
	}

	public static void ordrelokke(){
		Scanner sc = new Scanner(System.in);
		Sys
	}

=======
		ordrelokke();
		skrivTilFil();
	}
	
	public static void ordrelokke(){
		Scanner sc = new Scanner(System.in);
		
		loop: while(true){
			System.out.println("MENY! Dine valg:");
			System.out.println("A: Avslutt");
			System.out.println("P: Print alle viner");
			System.out.println("E: Endre navn pa en vin");
			
			String valg = sc.nextLine();
			
			switch(valg){
				case "A":
				break loop;
				
				case "P":
				printViner();
				break;
				
				case "E":
				endreVin();
				break;
			}	
		}
	}
	
	public static void printViner(){	
		for(Vin v : vinliste.values()){	
			System.out.println(v);
		}
	}
	
	public static void endreVin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hva er navnet pa vinen du vil endre?");
		String valg = sc.nextLine();
		
		if(vinliste.containsKey(valg)){
			System.out.println("Vinen finnes! Hva er nytt navn?");
			String nyttNavn = sc.nextLine();
			vinliste.get(valg).setNavn(nyttNavn);
			
			System.out.println("Nytt navn: " + vinliste.get(valg).getNavn());
			
		} else {
			System.out.println("Navnet du tastet finnes ikke");
		}
	}
	
>>>>>>> eb0c8f73da897a170475bcac1cbfda3f598b25a1
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
	
	public static void skrivTilFil() throws Exception {
		File fil = new File("vinliste.txt");
		PrintWriter pw = new PrintWriter(fil);
		
		for(Vin v : vinliste.values()){
			pw.println(v);
		}
		
		pw.close();
	}
}
<<<<<<< HEAD
=======











>>>>>>> eb0c8f73da897a170475bcac1cbfda3f598b25a1
