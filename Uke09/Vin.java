
public class Vin{
	
	private String navn;
	private int nummer;
	private int poeng;
	private int aargang;
	private int pris;
	
	public Vin(int nummer, String navn, int poeng, int aargang, int pris){
		this.navn = navn;
		this.nummer = nummer;
		this.poeng = poeng;
		this.aargang = aargang;
		this.pris = pris;
	}
	
	public String toString(){
		return nummer + " " + navn + " " + poeng + " " + aargang + " $" + pris;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
}




