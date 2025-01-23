package baekjoon;

import java.util.Scanner;

public class BJ2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();

        //45분 앞당기기
        if(m >= 45) {
            //현재 분이 45분 이상인 경우
            m -= 45;
        } else {
            //현재 분이 45보다 작은 경우
            m = 60 - (45 - m);
            if (h == 0) {
                h = 23; // 0시에서 1시간 줄이면 23시
            } else {
                h -= 1; //1시간 감소
            }
        }
        System.out.println(h + " " + m);
    }
}
