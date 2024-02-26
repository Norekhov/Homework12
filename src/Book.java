public class Book {
    private String title;
    private int yearRelease;
    private Author author;

    public Book(String title, int yearRelease, Author author) {
        this.title = title;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}