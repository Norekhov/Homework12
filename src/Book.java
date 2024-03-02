import java.util.Objects;

public class Book {
    private String title;
    private int yearRelease;
    private Author author;

    public Book(String title, int yearRelease, Author author) {
        this.title = title;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название книги - " + title + ", год издания - " + yearRelease + ", автор - " + author + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
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