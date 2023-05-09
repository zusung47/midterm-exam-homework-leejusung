package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {

    public void addDashToken(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        char [] arr = sc.nextLine().toCharArray();
        int i = 0;

        System.out.println("문자사이에 '-'를 끼워넣어서 출력합니다.");
        do{
            System.out.print(arr[i]);
            System.out.print('-');
            i++;
        }while(i < arr.length-1);
        System.out.print(arr[i]);
    }

    public void burgerKingMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========버거킹 메뉴===========");
        System.out.println(" 와퍼 통새우와퍼 불고기와퍼 치즈버거");
        System.out.println("6000원 8000원   6500원   4000원");
        System.out.println("===============================");
        System.out.println("'완료'를 입력하시면 총 주문내역을 출력합니다.");
        int price = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        String str = "";

        do{
            System.out.print("메뉴를 선택해주세요 : ");
            str = sc.nextLine();
            if(str.equals("와퍼")){
                price += 6000;
                count1++;
            }else if(str.equals("통새우와퍼")){
                price += 8000;
                count2++;
            }else if(str.equals("불고기와퍼")){
                price += 6500;
                count3++;
            }else if(str.equals("치즈버거")){
                price += 4000;
                count4++;
            }
        }while(!str.equals("완료"));
        System.out.println("**총 주문 내역**");
        System.out.printf("와퍼 %d개 통새우와퍼 %d개 불고기와퍼 %d개 치즈버거%d개\n", count1, count2, count3, count4);
        System.out.printf("총 %d원입니다.", price);
    }

    public void isStringAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        char [] arr = sc.nextLine().toCharArray();
        int check = 0;
        int i = 0;

        do{
            if(!(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')){
                check = 1;
            }
            i++;
        }while(check == 0 && i < arr.length);
        if(check==0){
            System.out.println("모든 글자가 영문자입니다.");
        }else{
            System.out.println("모든 글자가 영문자가 아닙니다.");
        }
    }

}
