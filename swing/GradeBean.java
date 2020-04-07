package com.jse.swing;

/*
클라이언트에서 프로그램 개발 요청이 왔습니다. 
이름과 국,영,수 세과목점수를 입력받아서
 [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요.
 
단) 평균은 소수점이하는 절삭합니다 

평균점수가 90점 이상 A  
80점 이상이면 B 
70점 이상이면 C 
60점 이상이면 D 
50점 이상이면 E 
50점 미만이면 F 학점입니다
라고 출력되게 해주세요
 * */
public class GradeBean {
	private String name;
	private int korean;
	private int math;
	private int english;
	
	
	public GradeBean(String name,int korean,int english,int math) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getKorean() {
		return korean;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnglish() {
		return english;
	}

	public int total() {
		return korean + english + math;
	}

	public int average() {
		return total() / 3;
	}
	public String grade2() {
		String grade = "";
		
		return grade;
	}

	public String grade() {
		String grade = "";
		int average = average();
		
		if(average >= 90) {
			grade = "A";
		}else if(average >= 80){
			grade = "B";
		}else if(average >= 70){
			grade = "C";
		}else if(average >= 60){
			grade = "D";
		}else if(average >= 50){
			grade = "E";
		}else {
			grade = "F";
		}
		return grade;
	}

}
