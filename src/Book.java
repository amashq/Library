public class Book {
    private String title;
    private String author;
    private int numberInSeries;
    private int numberOfPage;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberInSeries() {
        return numberInSeries;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public Book(String title, String author, int numberInSeries, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.numberInSeries = numberInSeries;
        this.numberOfPage = numberOfPage;
    }

    public Book(String title, String author, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    public Book(String title, int numberOfPage) {
        this.title = title;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Книга {" +
                "Название: '" + title + '\'' +
                ", автор: '" + author + '\'' +
                ", номер в серии: " + numberInSeries +
                ", число страниц: " + numberOfPage +
                '}';
    }
}
