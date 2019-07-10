package org.dimigo.oop;

public class Book {
    //필드 선언
    private String title = "Word Master";
    private String author = "이투스북";
    private int page = 300;

    //기본 생성자
    public Book() {
        //System.out.println("기본 생성자 호출");
    }
    //추가 생성자
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public Book(String title) {
        this.title = title;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String toString(){
        return "책제목:" +title
                + ", 저자명:" +author
                + ", 페이지수:"+page;
    }
}
