import java.util.Random;

class Reader {

    private Random random = new Random();

    Book choiceBook(Book[] books) {
        int numberOfBooks = random.nextInt(books.length);
        return books[numberOfBooks];
    }

    void readBook(Book book) {
        System.out.println(book.toString());
    }

    void setRatingBook(Book book) {

        int rating = 0;
        int randomRating = random.nextInt(11) + 1;

        if (book.getTitle() == null) {
            rating -= randomRating;
        } else {
            rating += book.getTitle().replaceAll(" ", "").length();
        }

        if (book.getAuthor() == null) {
            rating -= randomRating;
        } else {
            rating += book.getAuthor().replaceAll(" ", "").length();
        }

        if (book.getNumberInSeries() == 0) {
            rating -= randomRating;
        } else {
            rating -= book.getNumberInSeries();
        }

        if (book.getNumberOfPage() == 0) {
            rating -= randomRating;
        } else {
            rating += book.getNumberOfPage();
        }

        System.out.println("Оценка пользователя для книги " + book.getTitle() + ": " + rating);
    }
}
