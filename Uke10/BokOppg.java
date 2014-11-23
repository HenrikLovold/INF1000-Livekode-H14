public class Person{
	private HashMap<String, Bok> mineBoker = new HashMap<String, Bok>();
	
	public void leggTilBok(String tittel, Bok bok){
		mineBoker.put(tittel, bok);
	}
	
	public void laan(Person utlaaner, String tittel){
		utlaaner.laanBort(tittel);
	}
	
	public Bok laanBort(String tittel){
		if(mineBoker.containsKey(tittel)){
			System.out.println("Laaner bort " + tittel);
			return mineBoker.get(tittel);
		}
		System.out.println("Fant ikke boka");
		return null;
	}
}

public class Bok{
	private String tittel;
	
	public Bok(String tittel){
		this.tittel = tittel;
	}
}

public class Oppgave{
	public static void main(String[] args){
		Person per = new Person();
		Person mari = new Person();
		Bok bigJava = new Bok("Big Java");
		Bok rettPaaJava = new Bok("Rett Paa Java");
		
		per.leggTilBok("Big Java", bigJava);
		per.leggTilBok("Rett Paa Java", rettPaaJava);
		
		mari.laan(per, "Rett Paa Java");
	}
}