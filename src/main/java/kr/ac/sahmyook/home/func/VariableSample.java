package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {

    public void myProfile(){
        String name = "이주성";
        int age = 25;
        String school = "삼육대학교";
        String major = "컴퓨터공학부 소프트웨어학과";
        System.out.printf("이름 : %s\n나이 : %d\n학교 : %s\n전공 : %s\n", name, age, school, major);
    }

    public void empInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("사원의 정보를 입력합니다.");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("직급 : ");
        String level = sc.nextLine();
        System.out.print("부서 : ");
        String dep = sc.nextLine();
        System.out.println("=====사원 정보=====");
        System.out.printf("이름 : %s\n나이 : %d\n직급 : %s\n부서 : %s\n", name, age, level, dep);
    }

}
