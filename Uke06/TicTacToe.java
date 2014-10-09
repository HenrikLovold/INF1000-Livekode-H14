import java.util.Scanner;

class TicTacToe {
	static int rad0[] = new int[3];
	static int rad1[] = new int[3];
	static int rad2[] = new int[3];
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int spillerNr = 1;
		
		while(!(erBrettFullt())){
			
			if(spillerNr == 1){
				System.out.println("Spiller 1 sin tur!");
			} else {
				System.out.println("Spiller 2 sin tur!");
			}
			System.out.print("Tast inn radnummer: ");
			String innlest = in.nextLine();
			int radNr = Integer.parseInt(innlest)-1;
			
			System.out.print("Tast inn kolonnenummer: ");
			innlest = in.nextLine();
			int posNr = Integer.parseInt(innlest)-1;
			
			if(sjekkOgSettInn(radNr, posNr, spillerNr)){
				System.out.println("Spiller " + spillerNr +
				" satt inn brikke pa plass: " + radNr + ", " + posNr);
				spillerNr = (spillerNr==1)? 2 : 1;
				skrivUt();
			} else {
				System.out.println("Plassen er alt tatt, prov en annen");
			}
		}
		skrivUt();
	}
	
	static boolean sjekkOgSettInn(int rad, int pos, int spiller){
		if(rad == 0){
			if(rad0[pos] == 0){
				rad0[pos] = spiller;
				return true;
			} else {
				return false;
			}
		} else if(rad == 1){
			if(rad1[pos] == 0){
				rad1[pos] = spiller;
				return true;
			} else {
				return false;
			}
		} else if(rad == 2){
			if(rad2[pos] == 0){
				rad2[pos] = spiller;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	static boolean erBrettFullt(){
		int antFylte = 0;
		int maksAntPlasser = 9;
		
		for(int i = 0; i < rad0.length; i++){
			if(rad0[i]!=0) antFylte++;
			if(rad1[i]!=0) antFylte++;
			if(rad2[i]!=0) antFylte++;
		}
		return (antFylte == maksAntPlasser);
	}
	
	static void skrivUt(){
		for(int i = 0; i < rad0.length; i++){
			System.out.print(rad0[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < rad1.length; i++){
			System.out.print(rad1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < rad2.length; i++){
			System.out.print(rad2[i] + " ");
		}
		System.out.println();
	}
}
