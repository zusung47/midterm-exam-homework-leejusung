package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {

    public void maxNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 : ");
        int num2 = sc.nextInt();

        if(num2 > num1){
            num1 = num2;
        }
        System.out.printf("둘 중 더 큰 숫자는 %d입니다.", num1);
    }

    public void minNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 : ");
        int num2 = sc.nextInt();

        if(num2 < num1){
            num1 = num2;
        }
        System.out.printf("둘 중 더 작은 숫자는 %d입니다.", num1);
    }

    public void threeMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("숫자3 입력 : ");
        int num3 = sc.nextInt();

        int max = num1;
        int min = num1;
        //가장 큰 수 구하기
        if(num2 > num1){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        //가장 작은 수 구하기
        if(num2 < num1){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
        System.out.printf("셋 중 가장 큰 숫자는 %d입니다.\n셋 중 가장 작은 숫자는 %d입니다.", max, min);
    }

    public void checkEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
    }

    public void isPassFail(){
        System.out.println("**공지**\n평균 70점 이상이어야 합격입니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 입력 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수 입력 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수 입력 : ");
        int math = sc.nextInt();

        double avg = (int)(kor + eng + math)/3;

        if(avg>=70){
            System.out.println("합격을 축하합니다!!");
        }else{
            System.out.println("불합격입니다.");
        }
    }

    public void scoreGrade(){
        System.out.println("**공지**");
        System.out.println("A:100~90\nB:89~80\nC:79~70\nD:69~50\nF:49~0");
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = sc.nextInt();
        if(score>=90){
            System.out.println("A학점을 취득하셨습니다.");
        }else if(score>=80){
            System.out.println("B학점을 취득하셨습니다.");
        }else if(score>=70){
            System.out.println("C학점을 취득하셨습니다.");
        }else if(score>=50){
            System.out.println("D학점을 취득하셨습니다.");
        }else{
            System.out.println("F학점을 취득하셨습니다.");
        }
    }

    public void checkPlusMinusZero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("양수입니다.");
        }else if(num<0){
            System.out.println("음수입니다.");
        }else{
            System.out.println("0입니다.");
        }
    }

    public void whatCharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String c = sc.nextLine();
        if(c.charAt(0)>='0' && c.charAt(0)<='9'){
            System.out.println("숫자입니다.");
        }else if(c.charAt(0)>='a' && c.charAt(0)<='z'){
            System.out.println("영어소문자입니다.");
        }else if(c.charAt(0)>='A' && c.charAt(0)<='Z'){
            System.out.println("영어대문자입니다.");
        }else{
            System.out.println("기타문자입니다.");
        }
    }

}
