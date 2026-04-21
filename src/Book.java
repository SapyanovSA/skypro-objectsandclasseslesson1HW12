import java.util.Objects;

public class Book {

    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book bookCurrent = (Book) o;
        return Objects.equals(nameBook, bookCurrent.nameBook) && Objects.equals(author, bookCurrent.author) && Objects.equals(yearPublication, bookCurrent.yearPublication);
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", Автор: " + author.toString() + ", Год издания: " + yearPublication;
    }

}
