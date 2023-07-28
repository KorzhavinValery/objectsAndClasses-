public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Игорь", "Игорев");
        Author author2 = new Author("Владислав", "Весёлых");
        Book book1 = new Book("Как написать книгу", author1, 1980);
        Book book2 = new Book("Пустые страницы", author2, 1990);
        System.out.println(book1.toString());
        book1.setYearOfPublication(1989);
        System.out.println(book1.toString());
        System.out.println("======");
        System.out.println(author1.getName());
        System.out.println("======");
        System.out.println(book1.equals(book2));

    }
}