package org.dimigo.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            uncheckedException(null);
            checkedException();
            String id = "asddff";
            validate(id);
            System.out.println(id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void validate(String id) throws Exception{
        try {
            if (id == null || "".equals(id)) {
                Exception e = new Exception("ID를 입력하세요.");
                throw e;
            }
            if (id.length() < 8) {
                throw new Exception("8자 이상 입력하세요");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    private static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
            Integer.parseInt("123a");
        } catch(NullPointerException npe){
            System.out.println("문자열이 입력되지 않았습니다.");
        } catch(NumberFormatException nfe){
            System.out.println("숫자가 아닙니다.");
            nfe.printStackTrace();
        } catch(Exception e){ // 나머지 예외들
            System.out.println("알수 없는 오류입니다.");
        }
    }
    private static void checkedException() {
        try{
            BufferedReader br = new BufferedReader(
                new FileReader("input.txt"));
            String str;
            while ( (str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch(FileNotFoundException fne){
            System.out.println("파일이 없습니다.");
        } catch(IOException ie){
            System.out.println("파일 리딩 시 오류 발생");
        }


    }
}
