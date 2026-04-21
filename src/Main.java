//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Author author_1 = new Author("Сергей", "Пушкин");
        Author author_2 = new Author("Лев", "Толстой");

        Book book_1 = new Book("Капитанская дочка", author_1, 1836);
        Book book_2 = new Book("Война и мир", author_2, 1863);

        System.out.println(book_1);
        System.out.println(book_2);

        book_2.setYearPublication(1869);
        System.out.println(book_2);

    }
}