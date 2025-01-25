package baekjoon;

import java.util.Scanner;

public class BJ2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if( N >=1 && N <= 9 ) {
            for (int i = N; i <= N; i++) {
                for(int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + "=" + i*j );
                }
            }
        }
    }
}
// 수정
//이중 for문을 돌릴 필요는 없고 for문하나로 입력받은 N값을 N*j로 받으면 된다.


