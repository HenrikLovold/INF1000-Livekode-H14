import java.util.Scanner;

class TicTacToe{
    static int[] rad0 = new int[3];
    static int[] rad1 = new int[3];
    static int[] rad2 = new int[3];
    
    public static void main(String[]args){
        Scanner term = new Scanner(System.in);

        int spillernr = 1;

        while(!(erBrettFullt())) {

            if (spillernr == 1) {
                System.out.println("Spiller 1 sin tur:");
            }
            else {
                System.out.println("Spiller 2 sin tur:"); 
            }

            System.out.println("Skriv inn radnummer (0-2)");
            String innlest = term.nextLine();
            int radNr = Integer.parseInt(innlest);


            System.out.println("Skriv inn posisjonsnummer (0-2)");
            innlest = term.nextLine();
            int posNr = Integer.parseInt(innlest);

            if (sjekkOgSettInn(radNr, posNr, spillernr)) {
                skrivUt();
                spillernr = (spillernr == 1) ? 2 : 1;
            }
        }
        skrivUt();
    }

    public static void skrivUt() {
        for (int i = 0; i < rad0.length; i++) {
            System.out.print(rad0[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < rad1.length; i++) {
            System.out.print(rad1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < rad2.length; i++) {
            System.out.print(rad2[i] + " ");
        }
        System.out.println();
    }

    public static boolean sjekkOgSettInn(int radNr, int posNr, int spillernr) {
        if(radNr==0) {
            if(rad0[posNr]==0) {
                rad0[posNr] = spillernr;
                return true;
            } else {
                System.out.println("\nIkke godkjent (allerede fylt). Prøv igjen\n");
                return false;
            }
        }
        if(radNr==1) {
            if(rad1[posNr]==0) {
                rad1[posNr] = spillernr;
                return true;
            } else {
                System.out.println("\nIkke godkjent (allerede fylt). Prøv igjen\n");
                return false;
            }
        }
        if(radNr==2) {
            if(rad2[posNr]==0) {
                rad2[posNr] = spillernr;
                return true;
            } else {
                System.out.println("\nIkke godkjent (allerede fylt). Prøv igjen\n");
                return false;
            }
        }
        else {
            System.out.println("Ugyldig rad, prøv igjen");
            return false;
        }
    }

    public static boolean erBrettFullt() {

        int antallFylte = 0;
        int maksAntallPlasser = rad0.length + rad1.length + rad2.length;
        for(int i = 0; i<rad0.length; i++) {
            if (rad0[i]!=0) antallFylte++;
            if (rad1[i]!=0) antallFylte++;
            if (rad2[i]!=0) antallFylte++;
        }
        return (antallFylte==maksAntallPlasser) ;
    }
}