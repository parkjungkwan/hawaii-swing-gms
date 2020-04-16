package com.jse.grade;

public interface GradeService {
	public void add(Grade grade); 
	public Grade[] list();
	public Grade detail(Grade grade);
	public int count();
	public int total(Grade grade);
	public int average(Grade grade);
	public String record(Grade grade);
	public String ranking();
	public void update(Grade grade);
	public void delete(Grade grade);
}
