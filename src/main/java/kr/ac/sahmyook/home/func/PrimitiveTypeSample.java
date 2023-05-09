package kr.ac.sahmyook.home.func;

public class PrimitiveTypeSample {

    public void typeSize(){
        System.out.println("=====정수형=====");
        System.out.println("byte\n할당되는 메모리 크기 : 1바이트 | 데이터 표현 범위 : -128 ~ 127");
        System.out.println("short\n할당되는 메모리 크기 : 2바이트 | 데이터 표현 범위 : -2^15 ~ (2^15-1)");
        System.out.println("int\n할당되는 메모리 크기 : 4바이트 | 데이터 표현 범위 : -2^31 ~ (2^31-1)");
        System.out.println("long\n할당되는 메모리 크기 : 8바이트 | 데이터 표현 범위 : -2^63 ~ (2^63-1)");
        System.out.println("=====실수형=====");
        System.out.println("float\n할당되는 메모리 크기 : 4바이트 | 데이터 표현 범위 : (3.4*10^-38) ~ (3.4*10^38)");
        System.out.println("double\n할당되는 메모리 크기 : 8바이트 | 데이터 표현 범위 : (1.7*10^-308) ~ (1.7*10^308)");
        System.out.println("=====문자형=====");
        System.out.println("char\n할당되는 메모리 크기 : 2바이트 | 데이터 표현 범위 : 0 ~ 2^16");
        System.out.println("=====논리형=====");
        System.out.println("boolean\n할당되는 메모리 크기 : 1바이트 | 데이터 표현 범위 : true or false");
    }

}
