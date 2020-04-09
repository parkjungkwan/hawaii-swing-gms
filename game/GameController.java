package com.jse.game;

import java.util.Random;
import java.util.Scanner;
import com.jse.member.Member;
import com.jse.member.Kaup;
import com.jse.util.Calculator;

public class GameController {
	private String  test;
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Member member = new Member();
		Calculator calculator = null;
		Dice dice = null;
		RPSGame rpsGame = null;
		Kaup kaup = null;
		while (true) {
			System.out.println(
					"0. 종료 " + "1. 회원가입 " + "2. 로그인 " + "3. 계산기 " + "5. 주사위 홀짝 맞추기 " 
							+ "6. 카우푸지수" + "4. 가위바위보"
									+ "");
			int flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디 입력");
				String userid = scanner.next();
				member.setUserid(userid);

				break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getUserid();
				System.out.println("로그인된 아이디: " + returnId);
				if (id2.equals(returnId)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				calculator = new Calculator();
				System.out.println("계산기");
				System.out.println("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a);
				System.out.println("두번째 수 입력");
				int b = scanner.nextInt();
				calculator.setNum2(b);
				int c = calculator.calculate();
				System.out.println("두수의 합" + c);
				break;
			case 4:
				rpsGame= new RPSGame();
				System.out.println("**가위바위보 게임**");
				System.out.println("가위1, 바위2, 보 3 을 입력하세요");
				int user = scanner.nextInt();
				System.out.println("사용자가 입력한 값:" + user);
				rpsGame.setUserValue(user);
				
				int com = random.nextInt(3) + 1;
				System.out.println("컴퓨터가 입력한 값:" + com);
				rpsGame.setComputerValue(com);
				String gameResult = rpsGame.game();
				System.out.println(gameResult);
				break;
			case 5:
				dice = new Dice();
				System.out.println("주사위 홀짝 맞추기 게임");
				System.out.println("기대하는 값 홀/짝 을 입력해 주세요");
				String expect = scanner.next();
				System.out.println(String.format("사용자가 입력한 값: %s ", expect));
				dice.setExpect(expect);
				int diceNumber = random.nextInt(4);
				System.out.println(String.format("컴퓨터가 생성한 값: %d", diceNumber));
				dice.setDiceNumber(diceNumber);
				System.out.println(dice.switchDice());
				break;
			case 6: 
				kaup = new Kaup();
				System.out.println("키 ?");
				new Kaup().setHeight(scanner.nextDouble());
				System.out.println("몸무게 ?");
				kaup.setWeight(scanner.nextDouble());
				System.out.println(kaup.calculate());
				break;
			}

		}
	}

}














