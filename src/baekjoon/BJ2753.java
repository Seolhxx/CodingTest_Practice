package baekjoon;

import java.util.Scanner;

public class BJ2753 {
    public static void main(String[] args) {
        // 풀이1
//        Scanner san  = new Scanner(System.in);
//
//        int year = san.nextInt();
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("1");
//                } else {
//                    System.out.println("0");
//                }
//            } else {
//                System.out.println("1");
//            }
//        } else {
//            System.out.println("0");
//        }

        // 풀이2
        Scanner san  = new Scanner(System.in);

        int year = san.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
