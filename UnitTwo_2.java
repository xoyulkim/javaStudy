import java.util.Scanner;

public class UnitTwo_2 {
    public static void main(String[] args) {

        Scanner scanNum = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int num = scanNum.nextInt();
        int num2=num*num;

        System.out.printf("%d의 제곱은 %d", num, num2);
        //printf("%d의 제곱은 %d", num, num**2);로 쓰면 안 되는지
    }
}
