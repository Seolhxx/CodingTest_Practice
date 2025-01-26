package baekjoon;

import java.util.Scanner;

public class BJ10430 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int num1 = (A+B)%C;
        int num2 = ((A%C) + (B%C))%C;
        int num3 = (A*B)%C;
        int num4 = ((A%C) * (B%C))%C;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        //꼭 변수 num1 등등 처럼 저장할 필요는 없이 출력에 바로 식 값을 넣어서 출력해주면 된다.
//        System.out.println((A+B)%C);
//        System.out.println(((A%C) + (B%C))%C);
//        System.out.println((A*B)%C);
//        System.out.println(((A%C) * (B%C))%C);
    }
}
