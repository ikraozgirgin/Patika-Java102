
public class Main {

	public static void main(String[] args) {

		IMatematik toplama = (a,b) -> a + b;
		IMatematik cikarma = (a,b) -> a - b;
		IMatematik carpma = (a,b) -> a * b;
		IMatematik bolme = (a,b) -> {
			if (b == 0) {
				b = 1;
			}
			return a / b;
		};
		
		
		
		System.out.println(toplama.transaction(10, 2));
		System.out.println(cikarma.transaction(10, 2));
		System.out.println(carpma.transaction(10, 2));
		System.out.println(bolme.transaction(10, 2));
	

}
}
