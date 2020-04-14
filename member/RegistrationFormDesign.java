package com.jse.member;
import java.awt.Container;
import java.awt.Font;
// https://www.geeksforgeeks.org/java-swing-simple-user-registration-form/
import javax.swing.*;
public class RegistrationFormDesign extends JFrame{
	// Components of the Form 
    private Container container; 
    private JLabel title,nameLabel,useridLabel,passwordLabel,
    				ssnLabel,addrLabel; 
    private JTextField nameText, useridText, passwordText, ssnText,
    					addrText; 
    private JTextArea resultText; 
    private JButton submitButton; 
    private JButton resetButton; 
  
    public RegistrationFormDesign() 
    { 
        setTitle("Registration Form"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        container.add(title); 
  
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        container.add(nameLabel); 
  
        nameText = new JTextField(); 
        nameText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        nameText.setSize(190, 20); 
        nameText.setLocation(200, 100); 
        container.add(nameText); 
  
        useridLabel = new JLabel("Userid"); 
        useridLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        useridLabel.setSize(100, 20); 
        useridLabel.setLocation(100, 150); 
        container.add(useridLabel); 
  
        useridText = new JTextField(); 
        useridText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        useridText.setSize(150, 20); 
        useridText.setLocation(200, 150); 
        container.add(useridText); 
  
        passwordLabel = new JLabel("Password"); 
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        passwordLabel.setSize(100, 20); 
        passwordLabel.setLocation(100, 200); 
        container.add(passwordLabel); 
        
        passwordText = new JTextField(); 
        passwordText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        passwordText.setSize(150, 20); 
        passwordText.setLocation(200, 200); 
        container.add(passwordText);
  
        ssnLabel = new JLabel("SSN"); 
        ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        ssnLabel.setSize(100, 20); 
        ssnLabel.setLocation(100, 250); 
        container.add(ssnLabel); 
        
        ssnText = new JTextField(); 
        ssnText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ssnText.setSize(150, 20); 
        ssnText.setLocation(200, 250); 
        container.add(ssnText);
  
  
        addrLabel = new JLabel("Address"); 
        addrLabel.setFont(new Font("Arial", Font.PLAIN, 20)); 
        addrLabel.setSize(100, 20); 
        addrLabel.setLocation(100, 300); 
        container.add(addrLabel); 
        
        addrText = new JTextField(); 
        addrText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        addrText.setSize(150, 20); 
        addrText.setLocation(200, 300); 
        container.add(addrText);
        
  
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 450); 
        container.add(submitButton); 
  
        resetButton = new JButton("Reset"); 
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resetButton.setSize(100, 20); 
        resetButton.setLocation(270, 450); 
        container.add(resetButton); 
  
        resultText = new JTextArea(); 
        resultText.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resultText.setSize(300, 400); 
        resultText.setLocation(500, 100); 
        resultText.setLineWrap(true); 
        resultText.setEditable(false); 
        container.add(resultText); 
 
        setVisible(true); 
    } 
}
