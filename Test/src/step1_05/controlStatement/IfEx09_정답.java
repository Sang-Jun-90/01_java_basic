package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


public class IfEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 키는? ");
		int height = scan.nextInt();
	
		if(height >= 120) {
			System.out.println("이용가능");
		}
		if(height < 120) {
			System.out.print("부모님과 함께 오셨나요? (yes = 1 / no = 0)");
			int parents = scan.nextInt();
			if (parents == 1) {
				System.out.println("이용가능");
			}
			else {
				System.out.println("이용불가능");
			}
			
		}
		scan.close();
		
	}

}
