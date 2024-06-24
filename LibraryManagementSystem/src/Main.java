
public class Main {

	public static void main(String[] args) {
		Library library = new Library();

		Book book1 = new Book("978-605-173-609-9", "Aşırı Seven Kadınlar", "Robin NORWOOD", "Epsilon", 2005);
		Book book2 = new Book("978-625-6608-22-1", "Artık Kendin İçin", "Serdar VATANSEVER", "Destek", 2024);
		Book book3 = new Book("978-945-7004-19-6", "Öğretmenim Mori'yle Salı Buluşmaları", "Mitch ALBOM", "Boyner",
				1999);

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);

		Member member1 = new Member("1", "Nermin Semen ŞEN", "semen@hotmail.com", "5444252222");
		Member member2 = new Member("2", "Eda TEKE", "eda@hotmail.com", "545666222");

		library.addMember(member1);
		library.addMember(member2);

		System.out.println("Kütüphanede bulunan Kitaplar:");
		for (Book book : library.listAvailableBooks()) {
			System.out.println(book);
		}

		library.borrowBook(member1, book1);
		library.borrowBook(member2, book3);

		System.out.println("\n1. Üyenin Ödünç Aldığı Kitaplar:");
		for (Book book : library.listBorrowedBooks(member1)) {
			System.out.println(book);
		}

		System.out.println("\n2. Üyenin Ödünç Aldığı Kitaplar:");
		for (Book book : library.listBorrowedBooks(member2)) {
			System.out.println(book);
		}

		System.out.println("\nMüsait Kitaplar:");
		for (Book book : library.listAvailableBooks()) {
			System.out.println(book);
		}

		System.out.println("\n2. Üyenin Geri Getirdiği  Kitaplar:");
		for (Book book : library.listBorrowedBooks(member2)) {
			System.out.println(book);
		}
		library.returnBook(member2, book3);
		
		System.out.println("Müsait Kitaplar:");
		for (Book book : library.listAvailableBooks()) {
			System.out.println(book);
		}
	}
}
