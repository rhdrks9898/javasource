package op;

// byte, short는 연산 수행시 결과값이 int형으로 변경
// 즉 byte a + byte b = 오류!

public class ArthmeticEx1 {
    public static void main(String[] args) {
        
        byte a = 10, b = 4;

        // 해결책 1)
        int c = a + b;
        System.out.printf("a + b = %d\n", c);

        // 해결책 2)
        byte d = (byte)(a + b); // 단! -128 ~ 127의 수인 경우만!!
        System.out.printf("a + b = %d", d);

    }
}
