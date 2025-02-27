package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        
        // 문자 : 글자 한개 => 'a' or '미' or ' '(공백도 문자)
        // 문자열 : 글자 한개 ~ 여러개 => "a" or "abc" or "대" or "대한민국" or " "(공백도 문자열)
        
        // 여기서의 'a'는 그대로의 'a' 가 아닌 "코드"로 인식 => 유니코드(utf8)
        // 'a' -> 유니코드(숫자) : 인코딩 / 유니코드(숫자) -> 'a' : 디코딩딩
        char ch1 = 'a';
        int unicode = ch1;

        System.out.println("ch1 = " + ch1);
        System.out.println("unicode = " + unicode);

        char ch2 = 'A';
        unicode = ch2;

        System.out.println("ch2 = " + ch2);
        System.out.println(" unicode = " + unicode);

        // 'a' 의 유니코드 = 97
        // 'A' 의 유니코드 = 65
        // 이후 알파벳의 유니코드는 대/소문자에 + 1 씩씩

    }
}
