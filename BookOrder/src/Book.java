
public class Book implements Comparable<Book>{
	private String name;
	private int pageNumber;
	private String authorName;
	private String publicationDate;

	
	public Book(String name, int pageNumber, String authorName, String publicationDate) {
		this.name = name;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.publicationDate = publicationDate;
	}

	public String getName() {
		return name;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.name);
	}
	
	
}
