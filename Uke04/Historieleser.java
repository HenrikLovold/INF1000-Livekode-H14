/* Oppgave: Les inn filen historier.txt, og lagre alle linjer i en array.
 * Skriv så ut alle partallslinjer i en løkke. Hva skjer? Skriv etterpå
 * ut alle oddetallslinjer. Hva skjer da?
 *
 * Vi vet på forhånd at filen kommer til å ha 42 linjer.
 */

import java.io.File;
import java.util.Scanner;

class Historieleser {
	public static void main(String[] args) throws Exception {
		String filnavn = "historier.txt";
		File fil = new File(filnavn);
		Scanner in = new Scanner(fil);

		String[] linjer = new String[42];

		int teller = 0;
		while(in.hasNextLine()) {
			linjer[teller] = in.nextLine();
			teller = teller + 1;
		}

		System.out.println("\n\n===== FØRSTE HISTORIE =====");
		//Partallslinjer:
		for(int i = 0; i < linjer.length; i += 2) {
			System.out.println(linjer[i]);
		}

		System.out.println("\n\n===== ANDRE HISTORIE =====");
		//Oddetallslinjer:
		for(int i = 1; i < linjer.length; i += 2) {
			System.out.println(linjer[i]);
		}
	}
}