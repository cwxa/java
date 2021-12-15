package ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;    //�������İ�
public class Login extends JFrame{	
	JTextField logName;
	JPasswordField password;
	public Login () {
		super("�û���¼");      //������ͼ�����ñ���		
		Container contentPane=getContentPane();
		contentPane.setLayout(new GridLayout(6, 1));//���ò���Ϊ���񲼾�
		
		JPanel logPanel = new JPanel() ;         //������壺�����û�������
		JPanel PasswordPanel = new JPanel();		//������壺�������벿��
		JPanel buttonPanel = new JPanel();		//������壺���ְ�ť����
		
		JLabel wordLabel = new JLabel("Please Login!", JLabel.CENTER);
		wordLabel.setFont(new Font("����",Font.BOLD,17));
		JLabel logLabel = new JLabel("�û���");
		JLabel PasswordLabel = new JLabel("��    ��");
		logName = new JTextField(15);               //�����û����ı���
		password =new JPasswordField(15);		//���������
		JButton logButton = new JButton("��¼"); 
		JButton exitButton = new JButton("�˳�");
		
		logPanel.add(logLabel);
		logPanel.add(logName);
		PasswordPanel.add(PasswordLabel);
		PasswordPanel.add(password);
		buttonPanel.add(logButton);
		buttonPanel.add(exitButton);	
	
		contentPane.add(new JLabel(""));
		contentPane.add(wordLabel);
		contentPane.add(logPanel);
		contentPane.add(PasswordPanel);
		contentPane.add(buttonPanel);
		
		logButton.addActionListener(new ActionListener() {	// ע�������
			public void actionPerformed(ActionEvent e) {
				if(logName.getText().equals("Java") &&	new String(password.getPassword()).equals("2020"))
					JOptionPane.showMessageDialog(null, "��¼�ɹ�����ӭʹ��","", JOptionPane.PLAIN_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null, "��Ϣ��������������","", JOptionPane.ERROR_MESSAGE);					
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);   //�رճ���
			}
		});				
		setSize(300,250);
		setVisible(true);    //���ô���ɼ�
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
		public static void main(String[] args) {
		new Login();			
	}	
}
