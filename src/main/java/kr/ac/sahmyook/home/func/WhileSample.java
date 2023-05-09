package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {

    public void printUniCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("**0을 입력하면 종료됩니다.**");
        System.out.print("문자를 입력하세요 : ");
        char c = sc.nextLine().charAt(0);

        while(c!='0'){
            System.out.printf("%c의 유니코드는 %d입니다.\n", c, (int)c);
            System.out.print("문자를 입력하세요 : ");
            c = sc.nextLine().charAt(0);
        }
        if(c=='0') {
            System.out.println("종료합니다.");
        }
    }

    public void sum1To100(){
        int sum = 0;
        int i = 1;

        while(i < 101){
            sum += i;
            i++;
        }
        System.out.println("1~100까지 정수들의 합 : " + sum);
    }

    public void numberGame(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int check = 0;
        //1~100사이 난수 발생
        int x = (int)(Math.random()*100)+1;

        while(check==0){
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();
            count++;
            if(x==num){
                System.out.printf("정답입니다. %d회 만에 정답을 맞추셨습니다.", count);
                check = 1;
            }else if(num>x){
                System.out.println("입력하신 정수보다 작습니다.");
            }else if(num<x){
                System.out.println("입력하신 정수보다 큽니다.");
            }
        }
    }

    public void countCharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        int i = 0;

        while(i < str.length()){
            i++;
        }
        System.out.printf("%s의 글자 갯수는 %d개입니다.", str, i);
    }

    public void countInChar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("문자를 입력하세요 : ");
        char c = sc.nextLine().charAt(0);
        int i = 0;
        int count = 0;

        while(i < str.length()){
            if(str.charAt(i) == c){
                count++;
            }
            i++;
        }
        System.out.printf("문자열%s에는 문자%c(이)가 %d개 있습니다.", str, c, count);
    }

}
