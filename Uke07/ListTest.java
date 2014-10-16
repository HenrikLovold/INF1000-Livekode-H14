import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args){
		ArrayList<Telefon> list = new ArrayList<Telefon>();
		Telefon f = new Telefon(12312312);
		Telefon h = new Telefon(47810167);
		Telefon b = new Telefon(22222222);
		
		list.add(f);
		list.add(h);
		list.add(b);
		
		for(int i = 0; i < list.size(); i++){
			list.set(i, b);
		}
		
		for(int i = 0; i < list.size(); i++){
			list.get(i).printNummer();
		}
		
		list.remove(1);
		list.remove(1);
		
		System.out.println("Andre lokke");
		for(int i = 0; i < list.size(); i++){
			list.get(i).printNummer();
		}
	}
}

class Telefon {
	private int nummer;
	public Telefon(int nummer){
		this.nummer = nummer;
	}
	
	public void printNummer(){
		System.out.println(nummer);
	}
} 