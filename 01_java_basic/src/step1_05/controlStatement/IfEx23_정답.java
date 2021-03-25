package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 일일이 지정이 아닌 계산식으로 필요함.
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

public class IfEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇개의 정거장을 가세요? : ");
		int stationNum = scan.nextInt();
		
		if(stationNum > 0 && stationNum <= 5) {
			System.out.println("500원입니다.");
		}
		else if(stationNum > 5 && stationNum <= 10) {
			System.out.println("600원입니다.");
		}
		else if(stationNum > 10) {
			int extra = stationNum - 9;
			int extra1 = extra / 2;
			System.out.println((600 + extra1 * 50) + "원입니다.");
		}
		else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		scan.close();
		
	}

}
