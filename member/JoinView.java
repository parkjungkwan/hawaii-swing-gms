package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton, loginButton;
	JLabel[] labels;
	JTextField[] textFields;
	JPanel panel;
	MemberService memberService;
	public JoinView() {
		memberService = new MemberServiceImpl();
	}
	public void open() {
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		labels = new JLabel[6];
		textFields = new JTextField[6];
		String[] names = {"이름","아이디","패스워드","SSN","주소","검색결과"};
		for(int i=0;i < names.length;i++) {
			labels[i] = new JLabel(names[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
		}	
		saveButton = new JButton("저장");
		listButton = new JButton("목록");
		loginButton = new JButton("로그인");
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
		panel.add(saveButton); 
		panel.add(listButton);
		panel.add(loginButton);
		labels[0].setBounds(40,10,40,40);
		labels[1].setBounds(40,50,40,40);
		labels[2].setBounds(40,90,60,40);
		labels[3].setBounds(40,130,40,40);
		labels[4].setBounds(40,170,60,40);
		labels[5].setBounds(40,210,60,40);
		textFields[0].setBounds(120,10,200,30);
		textFields[1].setBounds(120,50,200,30);
		textFields[2].setBounds(120,90,200,30);
		textFields[3].setBounds(120,130,280,30);
		textFields[4].setBounds(120,180,280,30);
		textFields[5].setBounds(120,220,280,150);
		saveButton.setBounds(125,400,80,30);
		listButton.setBounds(240,400,80,30);
		loginButton.setBounds(340,400,80,30);
		
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == saveButton) {
			textFields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			textFields[1].setText("hong,you,lee,shin,leedo");
			textFields[2].setText("1,1,1,1,1");
			textFields[3].setText("900101-1,960101-2,980101-1,011010-4,020606-3");
			textFields[4].setText("서울,서울,서울,부산,부산");
			String data = String.format("%s / %s / %s / %s / %s", 
					textFields[0].getText(),
					textFields[1].getText(),
					textFields[2].getText(),
					textFields[3].getText(),
					textFields[4].getText());
			String[] arr = data.split("/");
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwords = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			for(int i=0;i< 5; i++) {
				members[i] = new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwords[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddr(addrs[i]);
				memberService.add(members[i]);
			}
			
		}else if(e.getSource() == listButton) {
			
		}
		
	}

}


















