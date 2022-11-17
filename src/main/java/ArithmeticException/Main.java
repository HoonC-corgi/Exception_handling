package ArithmeticException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("나뉨 수 입력: ");
            int dividend = scanner.nextInt();
            System.out.print("나눔 수 입력: ");
            int divisor = scanner.nextInt();

            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
                break;
            }
            catch (ArithmeticException e) {  //예외처리문, 정수를 0으로 나눌 시에 발생
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
            }
        }
        scanner.close();
    }
}
