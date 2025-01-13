import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		MyCalculator myCalculator = new MyCalculator();
		
		try {
			long result = myCalculator.power(n, p);
            System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			scanner.close();
		}
		
		
		
		
	}

}
