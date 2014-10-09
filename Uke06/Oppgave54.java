
public class Oppgave54 {
	public static void main(String[] args){
	
		Bondegard gard = new Bondegard();
		
		String[] gNavn = { "Jonas", "GeirArne", "KnutKjetil", "Purka", "Snoft" };
		String[] hNavn = { "LynRoger", "BlackBeautyQueenXX9" };
		String[] kNavn = { "Dagros", "Rigmor", "Rigfar", "Bjarne", "Knut", "Guro", "Bjartmar", "Olav" };
		
		for(int i = 0; i < gNavn.length; i++){
			Gris g = new Gris();
			g.giNavn(gNavn[i]);
			gard.settInnGris(g);
			System.out.println("Satt inn " + gNavn[i]);
		}
		
		for(int i = 0; i < hNavn.length; i++){
			Hest h = new Hest();
			h.giNavn(hNavn[i]);
			gard.settInnHest(h);
			System.out.println("Satt inn " + hNavn[i]);
		}
		
		for(int i = 0; i < kNavn.length; i++){
			Ku k = new Ku();
			k.giNavn(kNavn[i]);
			gard.settInnKu(k);
			System.out.println("Satt inn " + kNavn[i]);
		}
		
		
		gard.selgDyr("gris", 3);
		gard.selgDyr("hest", 1);
		gard.selgDyr("ku", 4);
	}
}
		