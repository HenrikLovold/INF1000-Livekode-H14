

public class ArrayEksempel{
	public static void main(String[] args){
		
		// Oppretter array med 10 plasser
		int[] tall = new int[10];
		
		// Går gjennom den tomme arrayen
		for(int i = 0; i < tall.length; i++){
			
			// Gir tall på plass i verdien
			// av i.
			tall[i] = i;
			
		}
		
		// Går gjennom arrayen en gang til
		for(int i = 0; i < tall.length; i++){
			
			// Skriver ut tallet på plass
			// i i arrayen.
			System.out.println(tall[i]);
			
		}
	}
}