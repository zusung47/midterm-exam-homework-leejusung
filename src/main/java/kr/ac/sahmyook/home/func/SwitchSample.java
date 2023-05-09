package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {

    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        System.out.println("계산 결과");
        System.out.printf("%d %c %d = %d", num1, op, num2, result);
    }

    public void fruitPrice(){
        System.out.println("==========과일 목록==========");
        System.out.println("   사과 수박 참외 바나나 딸기");
        System.out.println("===========================");

        Scanner sc = new Scanner(System.in);
        System.out.print("구매할 과일 : ");
        String fruit = sc.nextLine();
        int price = 0;

        switch (fruit){
            case "사과":
                price = 2000;
                break;
            case "수박":
                price = 20000;
                break;
            case "참외":
                price = 1200;
                break;
            case "바나나":
                price = 1500;
                break;
            case "딸기":
                price = 300;
                break;
            default:
                System.out.printf("죄송합니다. %s(는)은 없습니다.", fruit);
                break;
        }
        if(fruit.equals("사과") || fruit.equals("수박") || fruit.equals("참외") || fruit.equals("바나나") || fruit.equals("딸기")){
            System.out.printf("%s(는)은 %d원입니다.", fruit, price);
        }
    }

}
