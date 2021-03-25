package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */
// 2021-01-21 20:30 ~
public class IfEx21_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(101) + 150;
		int middelNum = (num / 10) % 10;
		System.out.println("가운데 숫자 맞추기 게임");
		System.out.println("숫자는 : " + num);
		System.out.println();
		System.out.print("가운데 숫자를 입력하세요 : ");
		int myNum = scan.nextInt();
		
		
		if (middelNum == myNum) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("틀렸어요.");
		}
		
		scan.close();
				
	}

}
