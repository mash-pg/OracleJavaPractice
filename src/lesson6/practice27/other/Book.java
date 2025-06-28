package lesson6.practice27.other;

public class Book {
	private String isbn;
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	//protectedならエラー
	public  void printInfo() {
		System.out.println(isbn);
	}

}
