import java.util.Scanner;

class Oppgave6 {
    public static void main(String[] args){
	
	String input;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Skriv noe morsomt");
	input = in.nextLine();

	int tall = Integer.parseInt(input);

	System.out.println(tall*tall);
    }
}