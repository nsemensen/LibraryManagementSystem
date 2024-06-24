import java.util.Objects;

public class Book {
	private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private int year;

    public Book(String ISBN, String title, String author, String publisher, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return  "ISBN=" + ISBN +", title=" + title +", author=" + author + ", publisher=" + publisher + ", year=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN.equals(book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
