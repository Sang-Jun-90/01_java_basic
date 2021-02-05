package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		System.out.print("첫번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.println( "두숫자의 합은 : " + (num1 + num2));
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		
		
		System.out.print("아무 숫자를 입력하세요.");
		int num3 = scan.nextInt();
		
		System.out.println(num3 % 2 != 0);
		
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		System.out.print("성적을 입력하세요.");
		int score = scan.nextInt();
		
		boolean scoreConfirm = score >= 60 && score <= 100;
		
		System.out.println(scoreConfirm);
		
		scan.close();
		
		
		
	}
	
}
