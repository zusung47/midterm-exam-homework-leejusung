package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public int a = 10;
    public void sumJumpThree(){
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i%3==0){
                continue;
            }
            sum += i;
        }
        System.out.println("1~100까지의 정수 중 3의 배수를 뺀 정수들의 합 : " + sum);
    }

    public void rowColJump(){
        int [][] arr = new int [3][5];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = j;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < 5; j++){
                if(i==0 && j>=2){
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
