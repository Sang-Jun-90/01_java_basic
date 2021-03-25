package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		// 계정만들기
		System.out.println("[회원가입]");
		System.out.print("Id 를 기입하세요 : ");
		dbId = scan.nextInt();
		System.out.print("Password 를 기입하세요 : ");
		dbPw = scan.nextInt();
		System.out.println();
		
		// 로그인 프로세스
		System.out.println("[로그인]");
		System.out.print("Id : ");
		int inputId = scan.nextInt();
		System.out.print("Password : ");
		int inputPassword = scan.nextInt();
		
		// db 와 입력값 비교
		if (inputId == dbId && inputPassword == dbPw) {
			System.out.println("로그인 성공");
		}
		if (inputId != dbId || inputPassword != dbPw) {
			System.out.println("로그인 실패");
		}
		
		
		scan.close();
		
		
		
	}

}
