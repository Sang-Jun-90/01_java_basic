package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 100;
		boolean isRunning = true;
		int mynum;
		int num = ran.nextInt(100)+1;
		System.out.println(num);
		
		int inputNum;
		
		while (isRunning) {
			System.out.println("숫자를 입력하세요 : ");
			inputNum = scan.nextInt();
			if (inputNum == num) {
				System.out.println("정답");
				mynum = score;
				System.out.println("당신의 남은점수는 : "+ score);
				isRunning = false;
			}
			else {
				score = score - 5;
				if (inputNum > num) {
					System.out.println("down");
				}
				else if (inputNum < num) {
					System.out.println("up");
				}		
			}
		}
		
		
		scan.close();
		
	}

}
