import java.util.Objects;

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
        return this.author = author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication < 0) {
            throw new IllegalArgumentException("Год не может быть отрицательным.");
        }
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author);
    }

    @Override
    public String toString() {
        return "Название книги = " + titleBook
                + "\n" + author.toString() + "\n" +
                "Год публикации = " + yearOfPublication;
    }
}
