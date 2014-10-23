public class ToStringTest {
	public static void main(String[] args){
		Person p = new Person();
		p.navn = "Bjarne";
		
		System.out.println(p);
	}
}

class Person {
	String navn;
	
	public String toString(){
		return navn;
	}
}