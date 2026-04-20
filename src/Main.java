//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Author author_1 = new Author("Сергей", "Пушкин");
        Author author_2 = new Author("Лев", "Толстой");

        Book book_1 = new Book("Капитанская дочка", author_1, 1836);
        Book book_2 = new Book("Войнна и мир", author_2, 1863);

        System.out.println("Название: " + book_1.getNameBook() + " Автор: " + book_1.getAuthor().getName() + " " + book_1.getAuthor().getSurname() + " Год издания: " + book_1.getYearPublication());
        System.out.println("Название: " + book_2.getNameBook() + " Автор: " + book_2.getAuthor().getName() + " " + book_2.getAuthor().getSurname() + " Год издания: " + book_2.getYearPublication());

        book_2.setYearPublication(1869);
        System.out.println("Название: " + book_2.getNameBook() + " Автор: " + book_2.getAuthor().getName() + " " + book_2.getAuthor().getSurname() + " Год издания: " + book_2.getYearPublication());

    }
}