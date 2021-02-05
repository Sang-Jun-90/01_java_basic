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
public class ifEx29_테스트문제2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int myDecision = 0;
		int comDecision = 0;
		
		String myText = null;
		String comText = null;
		
		// 안내 멘트

		System.out.println("[가위 바위 보 (하나빼기) 게임]");
		System.out.println("=================");
		System.out.println("가위 = 1 ");
		System.out.println("바위 = 2 ");
		System.out.println("보 = 3");
		System.out.println("=================");
		
		// 내 오른손, 왼손 결정 / 가위 = 1, 바위 = 2, 보 = 3
		
		System.out.print("왼손 : ");
		int meLeft = scan.nextInt();
		if (meLeft == 1) System.out.println("my왼손 : 가위");
		else if (meLeft == 2) System.out.println("my왼손 : 바위");
		else if (meLeft == 3) System.out.println("my왼손 : 보");
		else System.out.println("숫자를 잘못 입력했어요.");
		
		System.out.println();
		System.out.print("오른손 : ");
		int meRight = scan.nextInt();
		if (meRight == 1) System.out.println("my오른손 : 가위");
		else if (meRight == 2) System.out.println("my오른손 : 바위");
		else if (meRight == 3) System.out.println("my오른손 : 보");
		else System.out.println("숫자를 잘못 입력했어요.");
		System.out.println("=================");
		
		// 컴퓨터 결정 /  가위 = 3, 바위 = 2, 보 = 1
		
		int comLeft = ran.nextInt(3)+1;
		if (comLeft == 3) System.out.println("com왼손 : 가위");
		else if (comLeft == 2) System.out.println("com왼손 : 바위");
		else if (comLeft == 1) System.out.println("com왼손 : 보");
		System.out.println();
		int comRight = ran.nextInt(3)+1;
		if (comRight == 3) System.out.println("com오른손 : 가위");
		else if (comRight == 2) System.out.println("com오른손 : 바위");
		else if (comRight == 1) System.out.println("com오른손 : 보");
		System.out.println("=================");
		
		// 내선택
		
		System.out.println("왼손 : 1   //   오른손 : 2 ");
		System.out.print("선택 : ");
		int myChoice = scan.nextInt();
			// 왼손 선택
		if (myChoice == 1) {
			myDecision = meLeft;
			if (myDecision == 1) myText = "가위";
			else if (myDecision == 2) myText = "바위";
			else if (myDecision == 2) myText = "보";
		}
			// 오른손 선택
		else if (myChoice == 2) {
			myDecision = meRight;
			if (myDecision == 1) myText = "가위";
			else if (myDecision == 2) myText = "바위";
			else if (myDecision == 2) myText = "보";
		}
		else {
			System.out.println("숫자를 잘못 입력했어요.");
		}
		System.out.println("=================");
		
		// 컴퓨터의 선택
		
		int comChoice = ran.nextInt(2);
		if (comChoice == 0) {
			comDecision = comLeft;
			if (comDecision == 1) comText = "보";
			else if (comDecision == 2) comText = "바위";
			else if (comDecision == 2) comText = "가위";
		}
		else if (comChoice == 1) {
			comDecision = comRight;
			if (comDecision == 1) comText = "보";
			else if (comDecision == 2) comText = "바위";
			else if (comDecision == 2) comText = "가위";
		}
		
		// <승부가르기> 나의 가위바위보 배 숫자와 컴퓨터 가위바위보 배열 숫자를 더한다. 
		// 이때, 나의 가위바위보 배열 숫자와 컴퓨터 가위바위보 숫자 배열을 역순으로 배열한다.
		// 나의 배열 --  가위 = 1, 바위 = 2, 보 = 3
		// 컴퓨터 배열 --   가위 = 3, 바위 = 2, 보 = 1
		// 배열이 다르기때문에 각자 어떤걸 냈는지 추정이 가능(완전 정확하지는 않지만 승부는 확인가능)
		// 이를 통해서 승부를 가른다.
		
		if (myDecision + comDecision == 4) {
			System.out.println("비겼어요.");
			System.out.println("내선택 : "+ myText + " // 컴퓨터 선택 : "+ comText);
		}
		else if (myDecision + comDecision == 5 || myDecision + comDecision == 2) {
			System.out.println("내선택 : "+ myText + " // 컴퓨터 선택 : "+ comText);
			System.out.println("이겼어요.");
		}
		else {
			System.out.println("내선택 : "+ myText + " // 컴퓨터 선택 : "+ comText);
			System.out.println("졌어요.");
		}
		
		
		
		scan.close();
		
	}

}


















