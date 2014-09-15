class Skirenn {
	public static void main(String[] args){
		
		int[] deltakere = new int[4];
		
		deltakere[0] = 14;
		deltakere[1] = 10;
		deltakere[2] = 9;
		deltakere[3] = 29;
		
		int sum = 0;
		int i = 0;
		
		while(i < deltakere.length){
			sum = sum + deltakere[i];
			
			i++;
		}
		int snitt = sum/deltakere.length;
		System.out.println("Sum: " + sum);
		System.out.println("Snitt: " + snitt);
	}
}