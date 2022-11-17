package NumberFormatException;

public class Main {
    public static void main(String[] args) {
        String stringNumber [] = {"23", "12", "3.141592", "998"};

        int i=0;
        for(i=0; i<stringNumber.length; i++) {
            try{
                int j = Integer.parseInt(stringNumber[i]);  // 배열을 정수로 형변환
                // 3.141592는 정수 형태로 변환 불가 >> 오류발생
                System.out.println("숫자로 변환된 값은 " + j);
            }
            catch(NumberFormatException e) {
                System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
            }
        }
    }
}
