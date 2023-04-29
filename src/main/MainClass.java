package main;

import java.util.Scanner;

import notebook.NotebookService;

public class MainClass {
public static void main(String[] args) {
	
	NotebookService note = new NotebookService();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("선택");
	int num = sc.nextInt();
	switch(num) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		note.display();
		break;
	}
}
}
