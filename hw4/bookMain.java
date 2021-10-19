package hw4;

class Book {
    public String title,author;
    public int year,pages;
    public Boolean borrow;
    public Book(String title, String author, int year, int pages, Boolean borrow) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.borrow = borrow;
    }
    public Book(Book b) {
        if (b == null) {
            throw new IllegalArgumentException("reference as null");
        }
        title = b.title;
        author = b.author;
        year = b.year;
        pages = b.pages;
        borrow = b.borrow;
    }
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year + "\nAvailable: " + this.borrow + "\n";
    }
    public Boolean sameAs(Book book) {
        if (book.title == title && book.author == author && book.year == year && book.pages == pages) {
            return true;
        }
        return false;
    }
}
class bookMain {
    public static void main(String[] args) {
        Book b = new Book("Happiness","R.Goodman", 2001, 255, true);
        Book c = new Book("Toolor kulaganda","Aitmatov", 1993, 300, false);
        System.out.println(b.toString());
        Book d = new Book(c);
        System.out.println(c.toString());

        System.out.println(b.sameAs(b)); // true

        System.out.println(b.sameAs(c)); //false
    }
}