package kr.ac.sahmyook.home.func;

import java.util.*;

public class NonStaticMethodSample {

    public void testScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 받기");
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("입력한 문자열 : " + str);

        System.out.println("문자 입력 받기");
        System.out.print("문자를 입력하세요 : ");
        char c = sc.nextLine().charAt(0);
        System.out.println("입력한 문자: " + c);

        System.out.println("정수형 값 입력 받기");
        System.out.print("정수를 입력하세요 : ");
        int x =sc.nextInt();
        System.out.println("입력한 정수 값 : " + x);

        System.out.println("실수형 값 입력 받기");
        System.out.print("실수를 입력하세요 : ");
        double y = sc.nextDouble();
        System.out.println("입력한 실수 값 : " + y);

        System.out.println("논리형 입력 받기");
        System.out.print("논리 값을 입력하세요 : ");
        boolean b = sc.nextBoolean();
        System.out.println("입력한 논리 값 : " + b);
    }

    public void testRandom(){
        Random r = new Random();
        int x = r.nextInt();
        System.out.println("정수에 대한 난수 출력 : " + x);

        double y = r.nextDouble();
        System.out.println("실수에 대한 난수 출력 : " + y);
    }

    public static void main(String[] args){
        NonStaticMethodSample s = new NonStaticMethodSample();
        s.testRandom();
    }
}
