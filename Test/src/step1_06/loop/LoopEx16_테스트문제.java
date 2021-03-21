package step1_06.loop;

import java.util.Scanner;
import java.util.Random;

/*
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 * 
 * 
 */
// 2021-02-03 17:27 ~ 18:17
public class LoopEx16_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		// 목적지(destination)
		int desX = 0;
		int desY = 0;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		// 총거리수
		int totalRun = 0;
		
		boolean isRun = true;

		// 목적지 설정 
		while (true) {
			desX = ran.nextInt(21) - 10 ;
			desY = ran.nextInt(21) - 10 ;
			
			if (desX != 0 && desY != 0) break;
		}
		
		// game start
		
		while (isRun) {
	
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println();
			System.out.println("= M E N U =");
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			System.out.println("==========");
			
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			// 방향
			if (selectMenu == 1) {
				while (true) {
					System.out.println("방향설정 : 동(1)서(2)남(3)북(4)");
					System.out.print("선택 : ");
					dir = scan.nextInt();
					
					if (dir < 1 || dir > 4) System.out.println("뱡향(숫자)를 잘못 선택했어요.");
					else break;
				}
				System.out.println("-------");
			}
			// 속도
			else if (selectMenu == 2) {
				if (dir == 0) {
					System.out.println("방향을 먼저 설정해주세요.");
					System.out.println("-------");
					continue;
				}

				while ( true ) {				
					System.out.println();
					System.out.println("속도설정 : 1~3까지만 가능");
					System.out.print("선택 : ");
					speed = scan.nextInt();
					
					if (speed != 1 && speed != 2 && speed != 3)	System.out.println("속도(숫자)를 잘못 선택했어요.");
					else break;
					System.out.println();

				}
				System.out.println("-------");
			}
			
			// 이동
			else if (selectMenu == 3) {
				
				if (speed == 0) {
					System.out.println("속도를 먼저 설정해주세요.");
					System.out.println("-------");
					continue;
				}
				
				switch (dir){
					case 1 :
						x += speed;
						totalRun += speed;
						break;
					case 2 :
						x -= speed;
						totalRun += speed;
						break;
					case 3 :
						y -= speed;
						totalRun += speed;
						break;
					case 4 :
						y += speed;
						totalRun += speed;
						break;
					default :
						System.out.println("숫자를 잘못 선택했어요.");
						continue;
					
				}
				System.out.println("-------");
				speed = 0;
				dir =0;
			}
			
			// 메뉴를 잘못 선택한 경우
			else {
				System.out.println("메뉴를 다시 선택해주세요.");
				System.out.println("-------");
				continue;		
			}
			
			// 도착여부
			if (desX == x && desY == y) {
				System.out.println("도착");
				System.out.println("비용 : " + (totalRun + 1) / 2 * 50 );
				isRun = false;
				break;
			}
			
			
		}

		scan.close();
		
	}

}
