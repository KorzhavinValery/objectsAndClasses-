public class Book {
private String titleBook;
private Author author;
private int yearOfPublication;

    public Book(String titleBook, Author author, int yearOfPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleBook() {
        return this.titleBook;
    }
    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
public static void printBook(Book Book) {
    System.out.println("Название книги = " + Book.titleBook);
    Author.printAuthor(Book.author);
    System.out.println("Год публикации = " + Book.yearOfPublication);
}
}
