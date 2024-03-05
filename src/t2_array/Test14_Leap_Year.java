package t2_array;

import java.util.Scanner;

//윤년? 4로 나눠떨어지면 윤년? 이때 100으로 나눠떨어지면 평년? 이 년도가 400으로 나눠떨어지면 윤년이다.
public class Test14_Leap_Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요? ");
		int year = sc.nextInt();
		
		//if((year %4) == 0 &&(year % 100) != 0 || (year % 400) == 0)
		if((year %400) == 0 ||(year % 4) == 0 && (year % 100) != 0)
			System.out.println(year + "은 윤년입니다.");
		else 
			System.out.println(year + "은 평년입니다.");
		
		sc.close();

	}
}
