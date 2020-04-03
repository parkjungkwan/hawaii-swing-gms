package com.jse.swing;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		while(true) {
			System.out.println("0. 종료 1. 성적표");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
			grade = new Grade();
			System.out.println("이름");
			grade.setName(scanner.next());
			System.out.println("국어");
			grade.setKorean(scanner.nextInt());
			System.out.println("영어");
			grade.setEnglish(scanner.nextInt());
			System.out.println("수학");
			grade.setMath(scanner.nextInt());
			System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
					grade.getName(), grade.total(), grade.average(), grade.grade()));
			
			break;
			}
		}	
	}
}











