package acmain;

import java.util.Scanner;

import parents.parentsClass;

//공기청정기
public class acmain extends parentsClass{
	public void display() {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1. 전원on");
		System.out.println("2. 예약시간 입력");
		System.out.println("3. 냄새제거");
		System.out.println("4. 전원off");
		num = scan.nextInt();
		switch(num) {
		case 1:
			turnOn();
			break;
		case 2:
			timeset();
			break;
		case 3:
			sm();
			break;
		case 4:
			turnOff();
			break;
		default:
			System.out.println("오류");
			break;
			
		}
	}
	// 예약
	public void timeset() {
		System.out.print("예약 시간을 설정합니다");
		System.out.print("시간을 입력해주세요 ");
	}
	
	// 냄새제거
	public void sm() {
		System.out.print("냄새제거를 실시합니다");
	}
}
