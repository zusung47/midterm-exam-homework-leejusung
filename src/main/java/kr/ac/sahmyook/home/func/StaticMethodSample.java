package kr.ac.sahmyook.home.func;

public class StaticMethodSample {

    public void testMathRandom(){
        int x = (int)(Math.random()*45)+1;
        System.out.println("1~45사이의 임의의 정수 출력 : " + x);
    }

    public void testMathAbs(){
        double x = Math.abs(-12.77);
        System.out.println("-12.77의 절대값 : " + x);
    }

    public void testMathMax(){
        int a = 120;
        int b = 54;
        int x = Math.max(a,b);
        System.out.println("120과 54 중 큰 값 : " + x);
    }

}
