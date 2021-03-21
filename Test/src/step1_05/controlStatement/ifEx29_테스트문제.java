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
		
		int meLeft;
		int meRight;
		int comLeft;
		int comRight;
		int meFinal = 0;
		int comFinal = 0;
		
		// 안내 멘트

		System.out.println("[가위 바위 보 (하나빼기) 게임]");
		System.out.println("=================");
		System.out.println("가위 = 1 ");
		System.out.println("바위 = 2 ");
		System.out.println("보 = 3");
		System.out.println("=================");
		
		// 내 결정
		
		System.out.print("왼손 : ");
		meLeft = scan.nextInt();
		if (meLeft == 1) System.out.println("왼손 : 가위");
		else if (meLeft == 2) System.out.println("왼손 : 바위");
		else if (meLeft == 3) System.out.println("왼손 : 보");
		System.out.println();
		
		System.out.print("오른손 : ");
		meRight = scan.nextInt();
		if (meRight == 1) System.out.println("오른손 : 가위");
		else if (meRight == 2) System.out.println("오른손 : 바위");
		else if (meRight == 3) System.out.println("오른손 : 보");
		System.out.println("------------------");
		
		// 컴퓨터 결정
		
		comLeft = ran.nextInt(3)+1;
		if (comLeft == 1) System.out.println("com왼손 : 가위");
		else if (comLeft == 2) System.out.println("com왼손 : 바위");
		else if (comLeft == 3) System.out.println("com왼손 : 보");
		System.out.println();
		
		comRight = ran.nextInt(3)+1;
		if (comRight == 1) System.out.println("com오른손 : 가위");
		else if (comRight == 2) System.out.println("com오른손 : 바위");
		else if (comRight == 3) System.out.println("com오른손 : 보");
		System.out.println("------------------");
		
		//내최종 
		System.out.print("최종은? (왼손1 / 오른손2) ");
		int choice = scan.nextInt();
		if (choice == 1) meFinal = meLeft;
		else if (choice == 2) meFinal = meRight;
		System.out.println("------------------");
		
		//컴퓨터 최종 
		
		int comChoice = ran.nextInt(2);
		if (comChoice == 0) comFinal = comLeft;
		else if (comChoice == 1) comFinal = comRight;
		

		// 승부확인 
		if (meFinal == comFinal) System.out.println("비겼다.");
		else if (meFinal == 1 && comFinal == 3) {
			System.out.println("이겼다.");
		}
		else if (meFinal == 2 && comFinal == 1) {
			System.out.println("이겼다.");
		}
		else if (meFinal == 3 && comFinal == 2) {
			System.out.println("이겼다.");
		}
		else {
			System.out.println("졌다.");
		}
		
		
	}

}


















