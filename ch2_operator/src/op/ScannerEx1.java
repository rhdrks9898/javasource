package op;

import java.util.Scanner;

// 키보드로 입력 받는 방법
// System.In : 키보드로 입력
// System.out : 화면으로 출력

public class ScannerEx1 {
    public static void main(String[] args) {
        
        // 스캐너 입력을 위한 기초초
        Scanner scanner = new Scanner(System.in); // 키보드로 받기 위한 코드
        System.out.println("원하는 정수 입력"); // 사용자가 입력한 값(정수)를 input 변수값에 담기
        String input = scanner.nextLine(); // " " 사용자가 정수 입력(nextLine() : 문자열로 받아옴)
        int num = Integer.parseInt(input); // 정수 입력값(숫자로 된 문자열) => 일반 숫자값으로 변환(Integer.parseInt : 사용되는 변환 코드)

        // 스캐너 출력의 단계
        System.out.println(num);

        // 스캐너 종료
        scanner.close();
    }
}
