package Lab2.problem2;

import java.util.Vector;

public class LibraryTester {
    public static void main(String[] args) {
        Book book = new Book("Abay joly", "Mukhtar Auezov", 1956, 1600);
        Book book2 = new Book("Volokalamskoye Shosse", "Aleksandr Bek", 1944, 467);
        Book book3 = new Book("Qyzyl Kitap", "Qadyr Myrza Ali", 1978, 368);

        Vector<LibraryItem> library = new Vector<>();
        library.add(book);
        library.add(book2);
        library.add(book3);

        for(LibraryItem books : library){
            System.out.println(books.toString());
        }
    }
}
