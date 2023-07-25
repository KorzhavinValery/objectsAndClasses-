public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
    public static void printAuthor(Author Author) {
        System.out.println("ФИО Автора = " + Author.name + " " + Author.surname);
    }
}
