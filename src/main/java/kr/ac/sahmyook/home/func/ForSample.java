package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {

    public void sum1To10(){
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("1~10까지 정수들의 합 : " + sum);
    }

    public void sumEven1TO100(){
        int sum = 0;

        for(int i = 0; i <= 100; i+=2){
            sum += i;
        }
        System.out.println("1~100까지 짝수들의 합 : " + sum);
    }

    public void oneGugudan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 몇 단을 출력하시겠습니까? : ");
        int num = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }

    public void sumMinToMax(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();
        int sum = 0;
        int max;
        int min;

        if(num1 > num2){
            max = num1;
            min = num2;
        }else {
            max = num2;
            min = num1;
        }
        for(int i = min; i <= max; i++){
            sum += i;
        }
        System.out.printf("%d부터 %d까지의 합 : %d", min, max, sum);
    }

    public void printStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수 입력 : ");
        int jul = sc.nextInt();
        System.out.print("칸 수 입력 : ");
        int kan = sc.nextInt();

        for(int i = 0; i < jul; i++){
            for(int j = 0; j < kan; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void printNumberStar(){
        for(int i = 1; i < 8; i++){
            for(int j = 1; j < 8; j++){
                if(i==j){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

    public void printTriangleStar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("줄 수 입력 : ");
        int jul = sc.nextInt();

        if(jul > 0){
            for(int i = 1; i <= jul; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }else{
            jul = Math.abs(jul);
            for(int i = jul; i >= 1; i--){
                for(int j = i; j >= 1; j--){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }

    public void gugudan(){
        for(int i = 2; i <= 9; i++){
            System.out.printf("=====%d단=====\n", i);
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }

}
