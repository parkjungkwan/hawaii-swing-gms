package com.jse.grade;
import java.util.Scanner;

import com.jse.member.Member;

public class GradeController {

	// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeServcieImpl();
		
		Member[] members = new Member[3];
		
		while(true) {
			System.out.println("0. 종료 1.성적표입력 2. 성적표출력");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
			for(int i=0; i< 3;i++) {
				System.out.println("이름,국어,영어,수학  입력");
				gradeService.add(
						new Grade(
								scanner.next(),
								scanner.nextInt(),
								scanner.nextInt(),
								scanner.nextInt()));
			}
			
			break;
			case 2:System.out.println(gradeService.printGrades());break;
			case 3:
				System.out.println("총점별로 1, 2, 3등 이름 나열하기");
			}
		}	
	}
	public static Grade input(Scanner scanner) {
		System.out.println("이름,국어,영어,수학  입력");
		return new Grade(scanner.next(),
				scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
	}
	public static Member join(Scanner scanner) {
		int a = 1;
		a = 0;
		Member member = new Member();
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











