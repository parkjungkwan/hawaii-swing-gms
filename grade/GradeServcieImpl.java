package com.jse.grade;

public class GradeServcieImpl implements GradeService{

	private Grade[] grades;
	private int count;
	public GradeServcieImpl() {
		grades = new Grade[3];
		count = 0;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}
	@Override
	public Grade[] list() {
		return grades;
	}
	@Override
	public Grade detail(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int count() {
		return count;
	}
	@Override
	public int total(Grade grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath();
	}
	@Override
	public int average(Grade grade) {
		return total(grade) / 3;
	}
	@Override
	public String record(Grade grade) {
		String resule = "";
		int average = average(grade);
		
		if(average >= 90) {
			resule = "A";
		}else if(average >= 80){
			resule = "B";
		}else if(average >= 70){
			resule = "C";
		}else if(average >= 60){
			resule = "D";
		}else if(average >= 50){
			resule = "E";
		}else {
			resule = "F";
		}
		return resule;
	}
	
	@Override
	public String ranking() {
		int a = total(grades[0]);
		int y = total(grades[1]);
		int z = total(grades[2]);
		if (a > y && a>z) {
			if (y > z ) {
				System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:"
						+ grades[2].getName());
			} else if (z > y) {
				System.out.println("1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:"
						+ grades[1].getName());
			}
		} else if (y > a && y>z) {
			if (a > z) {
				System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:"
						+ grades[2].getName());
			} else if (z > a) {
				System.out.println("1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:"
						+ grades[0].getName());
			}
		} else if (z > y && z>a) {
			if (y > a) {
				System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:"
						+ grades[0].getName());
			} else if (a > y) {
				System.out.println("1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:"
						+ grades[1].getName());
			}
		}
		return null;
	}
	
	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub
		
	}
	
}
