package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

// 2021-01-26 20:32 ~
public class LoopEx04_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		int i = 0;
		System.out.println("[구구단게임]");
		while (i < 5) {
			int num1 = ran.nextInt(8)+2;
			int num2 = ran.nextInt(8)+2;
			System.out.print(num1 + " X "+  num2 + " = ");
			int answer = scan.nextInt();
			
			if (answer == num1*num2) {
				System.out.println("정답" );
				score += 20;
			}
			else {System.out.println("땡");}
			i++;
		}
		System.out.println("최종점수는 = " + score);
	}

}
