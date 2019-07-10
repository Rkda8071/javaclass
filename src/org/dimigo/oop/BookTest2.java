package org.dimigo.oop;

public class BookTest2 {
    private static boolean flag;
    public static void changeAttribute(Book book){
        book.setTitle("자바를 잡아라");
        //System.out.println("book2 : "+book.getTitle());
    }
    public static void compare(){
        int a=10;
        int b=10;
        //System.out.println((a==b) ? "true" : "false");

        Book book = new Book();
        Book book2 = book;
        //System.out.println(book == book2 ? "true" : "false");

        book.setTitle("수학의 바이블");
        //System.out.println(book.getTitle());
        //System.out.println(book2.getTitle());
    }
    public static void main(String[] args) {
        compare();
        Book book= new Book("미생","윤태호",1000);
        //System.out.println("book1 : " + book.getTitle());
        changeAttribute(book);
        //System.out.println("book3 : " + book.getTitle());

        int num = 5;
        methodA(num);
        System.out.println(num);

        //Book book2 = new Book("Word Master");
        book.setTitle("Word Master");
        methodB(book);
        System.out.println(book.getTitle());
        System.out.println("----------------------");

        methodC(book);
        System.out.println(book.getTitle());
        System.out.println("----------------------");

        Book book2 = new Book();
        System.out.println(book2.getTitle().length());

    }

    private static void methodC(Book book) {
        book.setTitle("생존코딩"); // 바뀜
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle()); // 안 바뀜
        book = new Book("이것이 자바다");
    }

    private static void methodA(int num) {
        num+=10;
        System.out.println(num);
    }
}
