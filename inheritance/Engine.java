package com.jse.inheritance;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class Engine {
	
	public static void main(String[] args) {
		PhoneService phoneService = new PhoneService();
		String message = "";
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0": return;
			case "1": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					phoneService.add(new Phone(values[0],values[1],values[2]));
				}
			break;
			case "2": 
				Phone[] phones = phoneService.getPhones(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += phones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
					phoneService.add(new CelPhone(values[0],values[1],values[2], true));
				}
				break;
			case "4": 
				CelPhone[] celPhones = phoneService.getCelPhones(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += celPhones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					phoneService.add(new Iphone(values[0], values[1], values[2], true, values[4]));
				}
				break;
			case "6": 
				Iphone[] iPhones = phoneService.getiPhones();
				message = "";
				for(int i=0; i< 3;i++) {
					message += iPhones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7": 
				for(int i=0;i<3;i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXY_NOTE_MENU).split(",");
					phoneService.add(new GalaxyNote(values[0], values[1], values[2], 
															true, values[3], values[4]));
				}
				break;
			case "8": 
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNote(); 
				message = "";
				for(int i=0; i< 3;i++) {
					message += galaxyNotes[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			
			}
		}
	}
	

}
