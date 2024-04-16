package Classes;

// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Book book, Member member) {
        if (!book.isAvailable()) {
            System.out.println("Sorry, the book is not available.");
            return;
        }

        System.out.println(member.getName() + " borrowed the book: " + book.getTitle());
        book.setAvailable(false);
    }

    public void returnBook(Book book, Member member) {
        System.out.println(member.getName() + " returned the book: " + book.getTitle());
        book.setAvailable(true);
    }
}

