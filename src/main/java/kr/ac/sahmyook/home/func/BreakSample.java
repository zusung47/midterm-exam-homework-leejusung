package kr.ac.sahmyook.home.func;

public class BreakSample {

    public void sumBreak(){
        int sum = 0;
        int i = 1;

        while(true){
            sum += i;
            if(i == 100){
                break;
            }
            i++;
        }
        System.out.println("1~100까지 정수들의 합 : " + sum);
    }

    public void guguDanBreak(){
        for(int i = 1; i <= 9; i++){
            System.out.println(i + "단");
            for(int j = 1; j <= 9; j++){
                if(j==6){
                    break;
                }
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }

}
