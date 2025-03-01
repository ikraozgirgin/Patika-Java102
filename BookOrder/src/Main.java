import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book("Içimizdeki Şeytan", 240, "Sabahattin Ali", "1921");
		Book b2 = new Book("Fareler ve İnsanlar", 110, "John Steinbeck", "1937");
		Book b3 = new Book("Kuyucaklı Yusuf", 140, "Sabahattin Ali", "1925");
		Book b4 = new Book("Mutluluk", 200, "Zülfü Livaneli", "2001");
		Book b5 = new Book("Çile", 300, "Necip Fazıl Kısakürek", "1970");
		
		
		TreeSet<Book> tSetBookName = new TreeSet<>();
		tSetBookName.add(b1);
		tSetBookName.add(b2);
		tSetBookName.add(b3);
		tSetBookName.add(b4);
		tSetBookName.add(b5);
		
		System.out.println("Kitap ismine göre sıralama");
		for (Book book : tSetBookName) {
			System.out.println(book.getName());
		}
		
		
		System.out.println("****************************************************");
		
		TreeSet<Book> tSetPageNumber = new TreeSet<>(new OrderPageComparator());
		tSetPageNumber.add(b1);
		tSetPageNumber.add(b2);
		tSetPageNumber.add(b3);
		tSetPageNumber.add(b4);
		tSetPageNumber.add(b5);
		
		System.out.println("Sayfa sayısına göre sıralama: ");
		for (Book book : tSetPageNumber) {
			System.out.println(book.getName());
		}
		

		
	}

}
