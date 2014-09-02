import java.util.Scanner;

class Oppgave116 {
    public static void main(String[] args){
	
	int x;
	int y;

	Scanner sc = new Scanner(System.in);

	String in1 = sc.nextLine();
	String in2 = sc.nextLine();

	x = Integer.parseInt(in1);
	y = Integer.parseInt(in2);

	System.out.println("Arealet er: " + (x*y));
    }
}