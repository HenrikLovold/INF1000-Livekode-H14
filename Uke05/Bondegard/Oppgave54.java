public class Oppgave54 {
	public static void main(String[] args){

		Bondegard gard = new Bondegard();


		String[] grisenavn = {"Purka", "Bajas", "Bollen", "Bacon", "Grisulf"};
		String[] hestenavn = {"Blakken", "Stjernen"};
		String[] kunavn = {"Dagros", "Ferdinand", "Kalvgeir", "Rigmor", "Rigfar", "Biffen", "Hamburgeir", "Bjartmar"};

		for(int i = 0; i < 5; i++){
			Gris g = new Gris();
			g.giNavn(grisenavn[i]);
			gard.settInnGris(g);
			System.out.println("Satt inn grisen: " + grisenavn[i]);
		}

		for(int i = 0; i < 2; i++){
			Hest h = new Hest();
			h.giNavn(hestenavn[i]);
			gard.settInnHest(h);
			System.out.println("Satt inn hesten: " + hestenavn[i]);
		}

		for(int i = 0; i < 5; i++){
			Ku k = new Ku();
			k.giNavn(kunavn[i]);
			gard.settInnKu(k);
			System.out.println("Satt inn kuen: " + kunavn[i]);
		}

		gard.selgDyr("gris", 3);
		gard.selgDyr("hest", 1);
		gard.selgDyr("ku", 4);
	}
}