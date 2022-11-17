package ArrayIndexOutOfBoundsException;

public class Main {
    public static void main(String [] args) {
        int intArray[] = new int[5];    // 5열 배열 생성
        intArray[0]=0;

        try{
            for(int i=0; i<5; i++) {
                intArray[i+1] = i+1 + intArray[i];  // i+1 번째 열의 원소는 i 번째 원소 + i+1이 됨
                // >> 인덱스의 범위가 0~4이기 때문에 i가 4일 때 인덱스가 5로 범위를 벗어나는 오류가 발생
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어남");
        }
    }
}
