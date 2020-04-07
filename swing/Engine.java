package com.jse.swing;
import java.util.Scanner;

public class Engine {

	// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeBean[] grades = new GradeBean[3];
		MemberBean[] members = new MemberBean[3];
		
		while(true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
			for(int i=0; i< 3;i++) {
				grades[i] = input(scanner);
			}
			break;
			case 2:
				for(int i=0;i<3;i++) {
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]",
							grades[i].getName(),
							grades[i].total(),
							grades[i].average(),
							grades[i].grade()));
				}
				break;
			case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");
			}
		}	
	}
	public static GradeBean input(Scanner scanner) {
		System.out.println("이름,국어,영어,수학  입력");
		return new GradeBean(scanner.next(),
				scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
	}
	public static MemberBean join(Scanner scanner) {
		int a = 1;
		a = 0;
		MemberBean member = new MemberBean();
		System.out.println("이름 입력");
		member.setName(scanner.next());
		System.out.println("ID 입력");
		member.setUserid(scanner.next());
		System.out.println("비번 입력");
		member.setPasswd(scanner.next());
		System.out.println("나이 입력");
		member.setAge(scanner.nextInt());
		return member;
	}

	
}











