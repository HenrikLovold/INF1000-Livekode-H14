import java.util.HashMap;

class HashMaps {
	public static void main(String[] args){
	
		HashMap<String, Integer> hester = new HashMap<String, Integer>();
		
		hester.put("baas 1", 3);
		hester.put("baas 2", 5);
		hester.put("baas 3", 1);
		
		System.out.println(hester.get("baas 1"));
		

	}
}