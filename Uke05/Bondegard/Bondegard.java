public class Bondegard {
	Gris[] grisebinge = new Gris[10];
	Hest[] stall = new Hest[5];
	Ku[] fjos = new Ku[30];

	int griseteller = 0;
	int hesteteller = 0;
	int kuteller = 0;

	public void settInnGris(Gris g){
		if(griseteller < grisebinge.length){
			grisebinge[griseteller] = g;
			griseteller++;
		} else {
			System.out.println("Bingen er full");
		}
	}

	public void settInnHest(Hest h){
		if(hesteteller < stall.length){
			stall[hesteteller] = h;
			hesteteller++;
		} else {
			System.out.println("Stallen er full");
		}
	}

	public void settInnKu(Ku k){
		if(kuteller < fjos.length){
			fjos[kuteller] = k;
			kuteller++;
		} else {
			System.out.println("Fjoset er fullt");
		}
	}

	public void selgDyr(String type, int antall){
		if(type.equalsIgnoreCase("gris")){

			for(int i = 0; i < antall; i++){
				if(griseteller > 0){
					griseteller--;
					grisebinge[griseteller] = null;
					System.out.println("Solgte en gris.");
				} else {
					System.out.println("Alle griser er solgt, du kan ikke selge flere.");
				}
			}

		} else if (type.equalsIgnoreCase("hest")) {

			for(int i = 0; i < antall; i++){
				if(hesteteller > 0){
					hesteteller--;
					stall[hesteteller] = null;
					System.out.println("Solgte en hest.");
				} else {
					System.out.println("Alle hester er solgt, du kan ikke selge flere.");
				}
			}

		} else if (type.equalsIgnoreCase("ku")){

			for(int i = 0; i < antall; i++){
				if(kuteller > 0){
					kuteller--;
					fjos[kuteller] = null;
					System.out.println("Solgte en ku.");
				} else {
					System.out.println("Alle kyr er solgt, du kan ikke selge flere.");
				}
			}

		} else {
			System.out.println("Ugyldig valg, dyr ikke funnet.");
		}
	}
}