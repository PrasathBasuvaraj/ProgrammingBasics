package Classes;

// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Basics", "Jane Smith");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice", 1001);
        Member member2 = new Member("Bob", 1002);
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(book1, member1);
        library.borrowBook(book2, member2);

        library.returnBook(book1, member1);
    }
}

