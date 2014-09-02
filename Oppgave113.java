import java.util.Scanner;

class Oppgave113{
    public static void main(String[] args){
	int x;
	int y;

	Scanner sc = new Scanner(System.in);

	String in1;
	String in2;

	System.out.print("Tast inn x: ");
	in1 = sc.nextLine();
	System.out.print("Tast inn y: ");
	in2 = sc.nextLine();

	x = Integer.parseInt(in1);
	y = Integer.parseInt(in2);

	System.out.println("Differansen mellom x og y er " + (x-y));
    }
}