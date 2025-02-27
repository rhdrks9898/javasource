package ch1;

// 형변환 = Casting
// 변수 or 상수의 타입 ==다른 타입=> 변경!

// 주의! : 큰 크기 => 작은 크기 = O / 큰 크기 ==강제형변환=> 작은 크기
// 주의! : float와 double은 손실이 확실히 일어남!!

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        System.out.println("d = " + d);
        int score = (int)d;
        System.out.println("score = " + score);

        int intValue = 10;
        double dblValue = 5.5;

        // int + double = double 결과값으로 나옴! why? double이 더 크니까 (즉, 바이트가 더 큰쪽으로 이동한다)
        int result = intValue + (int)dblValue;
        System.out.printf("result = %d\n", result);

        // 큰타입 -> 작은타입 형변환
        float f1 = 9.1234567f;
        double d1 = 9.1234567;

        float result2 = f1 + (float)d1;
        System.out.printf("result2 = %f\n", result2);

        // int(숫자) -> char(문자) 형변환환
        int num = 97;
        char ch1 = (char)num;
        System.out.println("ch1 = " + ch1);
    }
}
