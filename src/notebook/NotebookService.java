package notebook;

import java.util.Scanner;

import parents.parentsClass;

public class NotebookService extends parentsClass{
	
	private int num;
	private String id, pwd;
	
	public void display() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.종료");
			System.out.print(">>>");
			num = scan.nextInt();
			switch (num) {
			case 1:
				login_display(id, pwd);
				break;
			case 2:
				System.out.println("로그아웃되었습니다");
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(1);
				break;
			}
		}
	}
	// 1.로그인 기능
	public void login_display(String id, String pwd) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요: ");
		id = scan.next();
		System.out.print("비밀번호를 입력해주세요: ");
		pwd = scan.next();
		if (id.equals("admin")) {
			if (pwd.equals("1234")) {
				System.out.println("인증통과");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("존재하지 않는 아이디 입니다");
		}
	}
}
