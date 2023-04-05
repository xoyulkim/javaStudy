import java.util.Scanner;

public class UnitTwo_8 {
    public static void main(String[] args) {

        Scanner scanNum=new Scanner(System.in);

        System.out.println("0~999 사이의 숫자를 입력하세요: ");
        int num=scanNum.nextInt();

        int one, two, three, sum;
        one=num/100;
        two=(num%100)/10;
        three=((num%100)%10);

        sum=one+two+three;
        System.out.printf("각 자릿수의 합=%d", sum);
    }
}
