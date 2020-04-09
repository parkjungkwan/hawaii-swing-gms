package com.jse.member;
/*
개발자님 키와 몸무게를 이용하여
카우푸지수를 구하고 
그 결과 정상, 저체중, 비만 등으로 몸의 상태만 
알려주는 프로그램을 만들어 주세요 
 * */
public class Kaup {
	/*
	체중 (kg)÷키²(㎡)
	저체중
	<18.5
	정상체중
	18.5∼22.9
	과체중
	≥23.0
	위험체중
	23.0∼24.9
	비만 1단계(obese class I)
	25.0∼29.9
	비만 2단계(obese class II)
	> 30
	비만 3단계(obese class III)
	≥ 40.0
 
	 * */
	private double weight;
	private double height;
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setHeight(double height) {
		this.height  = height / 100;
	}
	public double getHeight() {
		return height;
	}
	public String calculate() {
		String result = "";
		double kaupIndex = weight / (height * height);
		System.out.println("카우푸지수 : "+kaupIndex);
		if(kaupIndex < 18.5) {
			result = "저체중";
		}else if(kaupIndex < 23.0) {
			result = "정상체중";
		}else if(kaupIndex < 25.0) {
			result = "과체중";
		}else if(kaupIndex < 25.0) {
			result = "위험체중";
		}else if(kaupIndex < 30.0) {
			result = "비만 1단계";
		}else if(kaupIndex < 40.0) {
			result = "비만 2단계";
		}else {
			result = "비만 3단계";
		}
		
		return result;
	}
	

}













