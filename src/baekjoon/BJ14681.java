package baekjoon;

import java.util.Scanner;

public class BJ14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x > 0 && y < 0) {
            System.out.println("4");

        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        // 다른 문제 풀이
        int result = (x > 0) ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);

    }
}
