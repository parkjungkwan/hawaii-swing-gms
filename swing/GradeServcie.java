package com.jse.swing;

public class GradeServcie {
	private GradeBean[] grades;
	private int count;
	public GradeServcie() {
		grades = new GradeBean[3];
		count = 0;
	}
	
	public void setGrades(GradeBean[] grades) {
		this.grades = grades;
	}
	public GradeBean[] getGrades() {
		return grades;
	}
	public void add(GradeBean grade) {
		grades[count] = grade;
		count++;
	}
	

}
