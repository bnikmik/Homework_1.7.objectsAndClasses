public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Гарри Поттер и философский камень", author1, 1997);
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        System.out.println("Книга: " + book1.getBookName()
                + ".\nАвтор: " + book1.getAuthor().getFirstName()
                + " " + book1.getAuthor().getLastName()
                + ".\nГод издания: " + book1.getPublicationYear());
        book2.setPublicationYear(2020);
        System.out.println("Книга: " + book2.getBookName()
                + ".\nАвтор: " + book2.getAuthor().getFirstName()
                + " " + book2.getAuthor().getLastName()
                + ".\nГод издания: " + book2.getPublicationYear());
    }
}