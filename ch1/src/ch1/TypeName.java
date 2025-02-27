package ch1;

public class TypeName {
public static void main(String[] args) {
    
    // 코드는 위에서부터 아래로 내려가면서 실행이 된다!!!!!

    // (1) = 8비트 = 2의 8승
    // ex) (4) = 4 x 8비트 = 2의 32승

    // 주의! : 수의 표현은 비트수의 반을 음수 양수로 놓고 0을 반드시 포함 시킨다!
    // ex) byte : -128 ~ 127

    // 기본 타입
    // 정수형 : byte(1) , short(2) , int(4) , long(8) 
    // 문자형 : char(2)
    // 실수형 : float(4) , double(8)    => 소수점 형태 사용시, 무조건 double로 인식함
    // 불린형(true, false) : bool(1)

    // 주의! : 같은 공간 크기인 int(4) , float(4) 는 float 가 더 크다!

    // 변수선언 방식 : 타입 변수명 = 값;
    int age = 15, maxSpeed = 100;
    int max = 256;

    // 도중에 변수값 변경 : 변수명(만 작성) = 새로운 값
    age = 30;
    
    // 변수명이 단어 두개의 합성인 경우 : 뒷 단어의 시작은 대문자로! ex) maxSpeed / but max_speed(스네이크 방식) 도 가능

    // " + " 는 두가지 의미로 사용 : 1) 산술연산  2) 연결(문자) -> 중간에 문자가 들어가야 한다
    System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed + ", max : " + max);

    // 주의! : 형식화된 출력의 연결은 , ln = "+"로 연결

    // 형식화된 출력
    // 정수 : %d
    // 실수 : %f
    // 문자 : %c
    // 문자열 : %s
    // 불린 : %b
    System.out.printf("나이 : %d, 최고속도 : %d, max : %d\n", age, maxSpeed, max);

    // \n : 형식화된 출력시 줄 바꿈의 역할 => 형식화된 출력시에만 \n 사용용
    // % 와 d, b 등 사이에 "숫자"를 쓰면 숫자만큼의 공백이 들어감
    System.out.printf("나이 : %20d\n", age);
    // % 와 f 사이에 ".숫자"를 쓰면 소수점 자리수 지정 가능
    double score1 = 98.339d; // double 타입은 d, D 붙여서 표현 (안 붙이면 double) / float 타입은 f, F 붙여서 표현
    System.out.printf("score1 = %.2f", score1);
    // %.0f => 형식화된 출력시 반올림 한다



    


    }
}
