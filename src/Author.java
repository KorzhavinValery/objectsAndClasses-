public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return "Имя автора = " + this.name;
    }

    public String getSurname() {
        return "Фамилия автора = " + this.surname;
    }

    @Override
    public String toString() {
        return
                "Имя = " + name + "\n" + "Фамилия = " + surname;
    }
}
