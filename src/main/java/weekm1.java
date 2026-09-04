class LibraryBook {
    private String title;
    private String isbn;

    // Constructor with ISBN
    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = (isbn == null || isbn.isEmpty()) ? "PENDING" : isbn;
    }

    // Constructor without ISBN - uses this() chaining
    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    public void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: true");
    }
}

public class weekm1 {

    public static void main(String[] args) {
        String[] titles = {
                "Clean Code",
                "Untitled Draft",
                "1984",
                "Notes"
        };

        String[] isbns = {
                "978-0132350884",
                "",
                "9780451524935",
                ""
        };

        // Single pass through the batch
        for (int i = 0; i < titles.length; i++) {
            LibraryBook book;

            if (isbns[i] == null || isbns[i].isEmpty()) {
                book = new LibraryBook(titles[i]);
            } else {
                book = new LibraryBook(titles[i], isbns[i]);
            }

            book.printStatus();
        }
    }
}