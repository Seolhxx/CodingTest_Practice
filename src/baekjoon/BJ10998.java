package baekjoon;

import java.util.Scanner;

public class BJ10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double result = (double) A / B;
        System.out.println(result);
    }
}
