package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        String id = "디미고";
        //id가 "admin"이면 관리자 출력
        // 아니면 아님 출력

        System.out.println((id!=null && id.toLowerCase().equals("디미고")) ? "관리자" : "관리자 아님");
        System.out.println(id.equalsIgnoreCase("디미고") ? "관리자" : "관리자 아님");

        testString();
    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());         // 14
        System.out.println(s.substring(3));     // i=3; s[i]!=null i++
        System.out.println(s.substring(3,6));   // i=3; i<6; i++
        System.out.println(s.indexOf("C"));     // C가 있는 문자
        System.out.println(s.charAt(9));        // 9에 있는 문자
        System.out.println(s.concat("ABC"));
        System.out.println(s.concat("     ABC   ".trim()));
        System.out.println(s.toUpperCase());    //대문자로
        System.out.println(s.toLowerCase());    //소문자로
        System.out.println(s.replace('a','A')); // 'a'를 'A'로
        System.out.println(s.startsWith("abc"));//boolean type "abc"로 시작하면 참트루 아니면 폴스
        System.out.println(s.endsWith("FG"));   //boolean type "FG"로 끝나면
        StringBuilder sb = new StringBuilder("김");
    }
}
