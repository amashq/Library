public class Library {

     public static  void main (String[] args) {
         Book book1 = new Book("Война и мир", "Лев Николаевич Толстой", 2, 313);
         Book book2 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1, 289);
         Book book3 = new Book("Ася", "Иван Сергеевич Тургенев", 107);
         Book book4 = new Book("Библия", 471);
         Book book5 = new Book("Триумфальная арка", "Эрих Мария Ремарк", 351);

         Book[] books = {book1, book2, book3, book4, book5};
         Reader reader = new Reader();
         Book choicedBook = reader.choiceBook(books);
         reader.readBook(choicedBook);
         reader.setRatingBook(choicedBook);
     }
}
