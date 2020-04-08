package com.jse.inheritance;
import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		PhoneService phoneService = new PhoneService();
		String message = "";
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog("0.종료\t 1.집전화입력\t 2.집전화출력"
					+ "\t 3.휴대전화입력\t 4.휴대전화출력\t 5.아이폰입력\t 6.아이폰출력 \t "
					+ "7.갤럭시입력\t 8.갤럭시출력")) {
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
					phoneService.add(new CelPhone(values[0],values[1],values[2], true));
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
			case "5": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog("입력: phoneNumber, name, company, search").split(",");
					phoneService.add(new Iphone(values[0], values[1], values[2], true, values[4]));
				}
				break;
			case "6": 
				Iphone[] iPhones = phoneService.getiPhones();
				message = "";
				for(int i=0; i< 3;i++) {
					message += String.format("출력: %s, %s, %s, %s \n", 
							iPhones[i].getPhoneNumber(),iPhones[i].getName(), 
							iPhones[i].getCompany(), iPhones[i].getMove(), 
							iPhones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog("입력: phoneNumber, name, company, search, bigsize").split(",");
					phoneService.add(new GalaxyNote(values[0], values[1], values[2], 
															true, values[3], values[4]));
				}
				break;
			case "8": 
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNote(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += String.format("출력: %s, %s, %s, %s,%s, %s \n", 
							galaxyNotes[i].getPhoneNumber(),galaxyNotes[i].getSearch(),
							galaxyNotes[i].getName(), galaxyNotes[i].getCompany(), 
							galaxyNotes[i].getMove(), galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			
			}
		}
	}

}
