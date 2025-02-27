package op;

import java.util.Scanner;

// 키보드로 연산자, 숫자 합쳐서 만들기

public class ScannerEx2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자 입력");
        String op = scanner.nextLine();

        System.out.println("첫번째 숫자 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input); // 여기서만 숫자를 입력하기에 Integer.parseInt로 변환이 필요한 거임임

        System.out.println("두번째 숫자 입력");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.printf("%d %s %d", num1, op, num2);

        scanner.close();
    }
}
