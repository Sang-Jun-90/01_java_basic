package step1_02.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		System.out.println();
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		
		int monthlyPay = 100;
		int salary = monthlyPay * 12;
		
		System.out.println("연봉 = " + (salary * 0.9)+ " 만원");
		System.out.println();
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		
		int class1 = 30;
		int class2 = 50;
		int class3 = 40;
		
		double average = (class1 + class2 + class3) / 3.0;
				
		System.out.println("평균점수는 = " + average + "점");
		System.out.println();
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		
		int ver = 6;
		int hor = 3;
		
		int triangle = ver*hor / 2;
				
		System.out.println("삼각형의 넓이는 = " + triangle);
		
		System.out.println();
		
		//문제4) 100초를 1분 40초로 출력
		

		int second = 100;
		int min = second / 60;
		int sec = second % 60;		
				
		System.out.println(min +" 분 " + sec + " 초 ");
		
		System.out.println();
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개), 100원(3개) 
		
		int money = 800;
		int fiveHCoin = 800 / 500;
		int oneHCoin = 800 % 500 / 100;
		
		System.out.println("500원 동전 : " + fiveHCoin +"개"+ " 100원 동전 : " + oneHCoin+"개" );

	}

}
