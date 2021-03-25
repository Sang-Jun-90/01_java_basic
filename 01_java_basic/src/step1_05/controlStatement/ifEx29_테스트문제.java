package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * megaitteachahn@gmail.com
 * 
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
//2021-01-26 20:00~
public class ifEx29_테스트문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 안내 멘트

		System.out.println("[가위 바위 보 (하나빼기) 게임]");
		System.out.println("=================");
		System.out.println("가위 = 1 ");
		System.out.println("바위 = 2 ");
		System.out.println("보 = 3");
		System.out.println("=================");
		
		// 내 오른손 왼손 결정
		
		System.out.print("왼손 : ");
		int meLeft = scan.nextInt();
		if (meLeft == 1) System.out.println("가위");
		else if (meLeft == 2) System.out.println("바위");
		else if (meLeft == 3) System.out.println("보");
		System.out.println();
		System.out.print("오른손 : ");
		int meRight = scan.nextInt();
		if (meLeft == 1) System.out.println("가위");
		else if (meLeft == 2) System.out.println("바위");
		else if (meLeft == 3) System.out.println("보");
		System.out.println();
		
		// 컴퓨터 결정
		
		int comLeft = ran.nextInt(3)+1;
		int comRight = ran.nextInt(3)+1;
		
	}

}


















