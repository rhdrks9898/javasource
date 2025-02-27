package op;

// char, int 등의 강제형변환
// a = 문자로 그리고 숫자로 표현하기기

public class ArthmeticEx2 {
    public static void main(String[] args) {
        
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        c2++;

        // 해결책 1)
        int result = c1 + 1;

        // 해결책 2)
        c3 = (char)(c1 + 1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("result = " + result);
        System.out.println("c3 = " + c3);

    }
}
