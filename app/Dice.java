package com.jse.app;
import java.util.Scanner;
import java.util.Random;

public class Dice {
	private String expect;
	private int diceNumber;
	
	public void setExpect(String expect) {
		this.expect = expect;
	}
	public String getExect() {
		return expect;
	}
	public void setDiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	public int getDiceNumber() {
		return diceNumber;
	}
	
	
	public String switchDice() {
		String result = "";
		switch(diceNumber) {
		case 1:case 3:case 5: result = "홀"; break;
		case 2:case 4:case 6: result = "짝"; break;
		}
		String result2 = "틀림";
		if(expect.equals(result)){
			result2 = "맞음";
		}
		System.out.println(String.format("결과: %s", result2));
		return result2;
	}
	
	
	public void ifDice() {
		System.out.println("*** 주사위 홀짝 맞추기 게임 ***");
		System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next(); 
		System.out.println("사용자 홀짝 예상값 :" + expect);
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		System.out.println("컴퓨터가 생성한 값 :" + dice);
		String result = "";
		if(dice == 1) {
			result = "홀";
		}else if(dice == 2) {
			result = "짝";
		}else if(dice == 3) {
			result = "홀";
		}else if(dice == 4) {
			result = "짝";
		}else if(dice == 5) {
			result = "홀";
		}else {
			result = "짝";
		} 
		System.out.println("컴퓨터 홀짝 결과: "+result);
		if(expect.equals(result)) { // object type 의 operation 은 method로 처리한다.
			System.out.println("매칭 결과: 맞음");
		}else {
			System.out.println("매칭 결과: 틀림");
		} 
	}
	
	

}













