package com.jse.grade;
import javax.swing.*;


public class GradeView extends JFrame{
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton;
	JLabel[] labels;
	JTextField[] textFields;
	JLabel areaLabel;
	JTextArea textArea;
	JPanel panel;
	
	
	public void open() {
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[5];
		textFields = new JTextField[5];
		textArea = new JTextArea();
		String[] names = {"이름","국어","영어","수학","자바"};
		for(int i=0;i < names.length;i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}	
		areaLabel = new JLabel("검색결과");
		panel.add(areaLabel);
		panel.add(textArea);
		saveButton = new JButton("저장");
		listButton = new JButton("목록");
		
		
		panel.add(saveButton); 
		panel.add(listButton);
		
		labels[0].setBounds(40,10,40,40);
		labels[1].setBounds(40,50,40,40);
		labels[2].setBounds(40,90,60,40);
		labels[3].setBounds(40,130,40,40);
		labels[4].setBounds(40,170,60,40);
		areaLabel.setBounds(40,210,60,40);
		textFields[0].setBounds(120,10,200,30);
		textFields[1].setBounds(120,50,200,30);
		textFields[2].setBounds(120,90,200,30);
		textFields[3].setBounds(120,130,280,30);
		textFields[4].setBounds(120,180,280,30);
		textArea.setBounds(120,220,280,150);
		saveButton.setBounds(125,400,80,30);
		listButton.setBounds(240,400,80,30);
		
		
		this.setLocationRelativeTo(null);
	}
}
