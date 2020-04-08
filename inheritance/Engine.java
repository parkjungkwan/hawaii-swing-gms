package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();
		String message = "";
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog("0.종료\t 1.집전화입력\t 2.집전화출력"
					+ "\t 3.휴대전화입력\t 4.휴대전화출력")) {
			case "0": return;
			case "1": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog("입력: phoneNumber, name, company").split(",");
					phoneService.add(new Phone(values[0],values[1],values[2]));
				}
			break;
			case "2": 
				Phone[] phones = phoneService.getPhones(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += String.format("출력: %s, %s, %s \n", phones[i].getPhoneNumber(),
							phones[i].getName(), phones[i].getCompany());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog("입력: phoneNumber, name, company").split(",");
					phoneService.addCelPhone(new CelPhone(values[0],values[1],values[2], true));
				}
				break;
			case "4": 
				CelPhone[] celPhones = phoneService.getCelPhones(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += String.format("출력: %s, %s, %s, %s \n", celPhones[i].getPhoneNumber(),
							celPhones[i].getName(), celPhones[i].getCompany(), celPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			
			}
		}
	}

}
