import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		
		read();	
		write();
		System.out.println("\n*****************************");
		read();
	
		

	}
	
	public static void read() {
			File file = new File("newText.txt");
		try {
			file.createNewFile();
			FileReader fileReader = new FileReader("newText.txt");
			int i = fileReader.read();
			while (i != -1) {
				System.out.print((char)i);
				i = fileReader.read();
			}
			
			fileReader.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	public static void write() {
		
		String data = "\nBen yeni eklenen satırım.";
		
		try {
			FileWriter fileWriter = new FileWriter("newText.txt" , true);
			fileWriter.write(data);
			fileWriter.close();
		} catch (Exception e) {
			e.getMessage();
		}
		
	
	}
	
	

}
