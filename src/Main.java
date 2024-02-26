public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Book one = new Book("Колобок", 1910, tolstoy);
        System.out.println("Название книги - " + one.getTitle() + ", год выпуска - " + one.getYearRelease() + ". Автор книги - " + one.getAuthor().getName() + " " + one.getAuthor().getSurname() + ".");


        Author pushkin = new Author("Александр", "Пушкин");
        Book two = new Book("Евгений Онегин", 1833, pushkin);
        System.out.println("Название книги - " + two.getTitle() + ", год выпуска - " + two.getYearRelease() + ". Автор книги - " + two.getAuthor().getName() + " " + two.getAuthor().getSurname() + ".");


        Author lermontov = new Author("Михаил", "Лермонтов");
        Book three = new Book("Герой нашего времени", 1838, lermontov);
        System.out.println("Название книги - " + three.getTitle() + ", год выпуска - " + three.getYearRelease() + ". Автор книги - " + three.getAuthor().getName() + " " + three.getAuthor().getSurname() + ".");
        three.setYearRelease(1846);
        System.out.println("Название книги - " + three.getTitle() + ", год выпуска - " + three.getYearRelease() + ". Автор книги - " + three.getAuthor().getName() + " " + three.getAuthor().getSurname() + ".");
    }
}