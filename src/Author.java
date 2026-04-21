import java.util.Objects;

public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Author author2 = (Author) o;
        return Objects.equals(name, author2.name) && Objects.equals(surname, author2.surname);
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + surname;
    }
}
