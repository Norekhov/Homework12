public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Book one = new Book("Колобок", 1910, tolstoy);
        System.out.println(one);

        Author pushkin = new Author("Александр", "Пушкин");
        Book two = new Book("Евгений Онегин", 1833, pushkin);
        System.out.println(two);


        Author lermontov = new Author("Михаил", "Лермонтов");
        Book three = new Book("Герой нашего времени", 1838, lermontov);
        System.out.println(three);
        three.setYearRelease(1846);
        System.out.println(three);
    }
}