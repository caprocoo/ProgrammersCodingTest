package theory.java.source.gof.behavioral.iterator;

import java.util.Iterator;

/**
 * packageName    : theory.java.source.gof.behavioral.iterator
 * fileName       : Main2
 * author         : caprocoo
 * date           : 2023-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-10        caprocoo       최초 생성
 */
public class Main2 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-legs"));

        Iterator it = bookShelf.iterator();
        System.out.println(it.hasNext());
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println("asdasdsd");
            System.out.println(book.getName());
        }
    }
}

interface Aggregate2{
    Iterator iterator();
}


class Book{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class BookShelf implements Aggregate2 {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        ++index;
        return book;
    }
}


