package org.dimigo.inheritance;

public class Student extends Person{
    private String studentId;

    public Student(String name,int age, int height, int weight, String studentId) {
        super(name,age,height,weight); // 부모의 생성자 호출
        //부모의 생성자 호출 안하면 자동으로 super(); 부모의 기본생성자 호출
        // protected
        // default
        this.studentId = studentId;
    }

    public void exam(){
        System.out.println(super.getName() + "이 시험을 봅니다.");
    }
    public void study(){
        System.out.println(super.getName() + "이 공부를 합니다.");
    }

    public String toString() {
        return "Student{" +
                "studentId" + studentId
                + super.toString();
    }
}
