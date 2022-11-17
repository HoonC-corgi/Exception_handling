package InputMismatchException;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum=0, n=0;
        for(int i=0; i<3; i++) {
            System.out.print(i+">> ");

            try{
                n=scanner.nextInt();    //문자 입력시 오류 발생
            }
            catch(java.util.InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.next(); //  입력 스트림에 있는 정수가 아닌 토큰(문자)를 버리고 새로 받음
                i--;    // 인덱스를 감소해 ArrayIndexOutOfBounds 방지
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
