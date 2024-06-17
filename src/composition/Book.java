package composition;

public class Book {
	
	String bookName;
	String bookId;
	Author author;
	
	
	
	public Book(String bookName, String bookId, Author author) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
	}



	public static void main(String[] args) {
		
		Author author=new Author("james", "USA", "45123");
		Book b=new Book("java", "J123", new Author("james", "USA", "45123"));
		
		System.out.println(b.bookName);
		System.out.println(b.author.getAuthorName());
	}

}
