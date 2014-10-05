public class Bondegard {
	Gris[] grisebinge = new Gris[10];
	Hest[] stall = new Hest[5];
	Ku[] fjos = new Ku[30];

	public void settInnGris(Gris g){
		for (int i = 0; i < grisebinge.length; i++) {
        	if (grisebinge[i] == null) {
           		grisebinge[i] = g;
            	return;
        	}
    	}
	}

	public void settInnHest(Hest h){
		for (int i = 0; i < stall.length; i++) {
        	if (stall[i] == null) {
           		stall[i] = h;
            	return;
        	}
    	}
	}

	public void settInnKu(Ku k){
		for (int i = 0; i < fjos.length; i++) {
        	if (fjos[i] == null) {
           		fjos[i] = k;
            	return;
        	}
    	}
	}

	public void selgDyr(String type, int antall){
		if(type.equalsIgnoreCase("gris")){

			for (int i = 0; i < grisebinge.length; i++) {
                if (grisebinge[i] != null && antall > 0) {
                    grisebinge[i] = null;
                    antall--;
                    System.out.println("Solgte en gris.");
                }
            }

		} else if (type.equalsIgnoreCase("hest")) {

			for (int i = 0; i < stall.length; i++) {
                if (stall[i] != null && antall > 0) {
                    stall[i] = null;
                    antall--;
                    System.out.println("Solgte en hest.");
                }
            }

		} else if (type.equalsIgnoreCase("ku")){

			for (int i = 0; i < fjos.length; i++) {
                if (fjos[i] != null && antall > 0) {
                    fjos[i] = null;
                    antall--;
                    System.out.println("Solgte en ku.");
                }
            }

		} else {
			System.out.println("Ugyldig valg, dyr ikke funnet.");
		}
	}
}