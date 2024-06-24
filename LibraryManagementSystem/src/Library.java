import java.util.*;

public class Library {
	private List<Book> books;
	private List<Member> members;
	private Map<Member, List<Book>> borrowedBooks;

	public Library() {
		books = new ArrayList<>();
		members = new ArrayList<>();
		borrowedBooks = new HashMap<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(String ISBN) {
		books.removeIf(book -> book.getISBN().equals(ISBN));
	}

	public void addMember(Member member) {
		members.add(member);
	}

	public void removeMember(String memberID) {
		members.removeIf(member -> member.getMemberID().equals(memberID));
		borrowedBooks.remove(memberID);
	}

	public void borrowBook(Member member, Book book) {
		if (books.contains(book)) {
			books.remove(book);
			borrowedBooks.computeIfAbsent(member, k -> new ArrayList<>()).add(book);
		} else {
			System.out.println("Kitap mevcut değil veya zaten ödünç alınmış.");
		}
	}

	public void returnBook(Member member, Book book) {
		List<Book> borrowed = borrowedBooks.get(member);
		if (borrowed != null && borrowed.contains(book)) {
			borrowed.remove(book);
			books.add(book);
			if (borrowed.isEmpty()) {
				borrowedBooks.remove(member);
			}
		} else {
			System.out.println("Üye bu kitabı ödünç almamış.");
		}
	}

	public List<Book> listAvailableBooks() {
		return new ArrayList<>(books);
	}

	public List<Book> listBorrowedBooks(Member member) {
		return borrowedBooks.getOrDefault(member, Collections.emptyList());
	}
}
