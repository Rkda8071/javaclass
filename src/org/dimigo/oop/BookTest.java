package org.dimigo.oop;

public class BookTest {


    public static void main(String[] args) {
        Book book;
        book = new Book();

        Book book2 = new Book();

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 바이블");
        book.setAuthor("민경도");
        book.setPage(200);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        Book book3 = new Book("언어의 정원","신카이 마코토",100);
        Book book4 = new Book("언어의 정원","신카이 마코토");
        Book book5 = new Book("언어의 정원");
    }
}
