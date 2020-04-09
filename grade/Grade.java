package com.jse.grade;

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
public class Grade {
	private String name;
	private int korean, english, math;
	
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
	

	@Override
	public String toString() {
		return "Grade [name=" + name + ", korean=" + korean + ", math=" + math + ", english=" + english + "]";
	}

}
