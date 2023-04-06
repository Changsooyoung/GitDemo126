package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
	Scanner sc100 = new Scanner(System.in);// class는 기본자료형이 아니여서 몇바이트인지 모른다. 따라서 수동으로 메모리에 올려야한다.
    // (new) 메모리에 올라가서 생성해라 => 주소값이 생겼다
	System.out.print("점수를 입력하세요. (0~100점) : ");
	
	// 참조변수, 메서드명
	// nextInt() : 콘솔에서 입력받은 정수를 읽어들임
	int score = sc100.nextInt(); // 주소값을 통해 클래스안에 있는 메서드를 사용 => 무조건 주소값을 통해 매서드 호출!
	
	// int score = 101; scanner 클래스로 이 기능 사용 불필요
	char grade = ' ';

	if((score > 100) || (score < 0)) {
		System.out.println(score + "은(는) 잘못된 점수입니다.");
	}
	
	else {
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {			
			grade = 'F';
		}
		System.out.println("점수 : " + score + ", 학점: " + grade);
		} // else
	
	sc100.close();
	}
}
