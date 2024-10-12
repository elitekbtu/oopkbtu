package Lab2.problem_b;

public class Book extends LibraryItem {
    private int numberOfPages;
    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int getPublicationYear() {
        return super.getPublicationYear();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public void setPublicationYear(int publicationYear) {
        super.setPublicationYear(publicationYear);
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book [Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Year: " + getPublicationYear() +
                ", Number of pages: " + getNumberOfPages()
                + "]";
    }
}