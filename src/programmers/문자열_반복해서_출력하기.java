package programmers;

import java.util.Scanner;

public class 문자열_반복해서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print(str);
        }

        // 다른 사람 풀이
        // 문자열을 주어진 횟수만큼 반복해 붙인 새로운 문자열을 반환
        System.out.println(str.repeat(n));
    }
}
