package com.jse.swing;

public class GradeServcie {
	private GradeBean[] grades;
	public GradeServcie() {
		grades = new GradeBean[100];
	}
	
	public void setGrades(GradeBean[] grades) {
		this.grades = grades;
	}
	public GradeBean[] getGrsades() {
		return grades;
	}
	

}
