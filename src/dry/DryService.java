package dry;

import java.util.Scanner;

public class DryService {
	public void DryService() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("==============");
			System.out.println("드라이 사용하기");
			System.out.println("1. 온도 조절");
			System.out.println("2. 바람세기 조절");
			System.out.println("3. 드라이기 사용 종료");
			System.out.print(">>>>>>>>");
			
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("온도를 조절합니다.");
				break;
			case 2:
				System.out.println("바람세기를 조절합니다");
				break;
			case 3:
				System.out.println("드라이기 off");
				System.exit(1);
				
			
			}
		}
	}

}
