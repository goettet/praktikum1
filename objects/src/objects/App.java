package objects;

public class App {

	public static void main(String[] args) {
		
		Banane b1 = new Banane();
		Banane b2 = new Banane();
		
		b1.color = "yellow";
		b1.weight = 130;
	
		b2.color = "green";
		b2.weight = 120;
		
		System.out.println("Banane's color: "+ b1.getColor());
		System.out.println("Banane's color: "+ b1.getWeight());
		
		System.out.println("++++++++++++++");
		
		System.out.println("Banane's color: "+ b2.getColor());
		System.out.println("Banane's color: "+ b2.getWeight());
	}

}
