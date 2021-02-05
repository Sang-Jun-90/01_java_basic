package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */
// 2021-02-03 16:41 ~ 16:58
public class LoopEx15_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int sum = 0; 
		int suc = 0;
		int max = 0;
		
		for (int i = 0 ; i <10 ; i++) {
			int score = ran.nextInt(100)+1;
			sum += score;
			
			if (score >= 60) {
				suc++;
			}
			if (score >= max) {
				max = score;
			}
			
			
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / 10.0);
		System.out.println("합격자수 : " + suc);
		System.out.println("1등 : " + max);
		
		
		
	}

}
