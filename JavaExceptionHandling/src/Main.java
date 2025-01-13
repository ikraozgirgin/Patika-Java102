import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		try {
			
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(x/y);
		
		} catch (ArithmeticException a) {
			System.out.println(a.toString());
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		}finally {
			scanner.close();
		}
		
	}

}
