package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울","대전","대구","부산"};
        //배열 출력
        System.out.println(Arrays.toString(src));
        String[] dest = Arrays.copyOf(src,src.length);
        System.out.println(Arrays.toString(dest));

        //배열 주소값 비교
        System.out.println(src == dest);

        //배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //배열 검색
        System.out.println(Arrays.binarySearch(dest,"부산"));
    }
}
