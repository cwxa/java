package ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;    //导入必须的包
public class Login extends JFrame{	
	JTextField logName;
	JPasswordField password;
	public Login () {
		super("用户登录");      //看运行图，设置标题		
		Container contentPane=getContentPane();
		contentPane.setLayout(new GridLayout(6, 1));//设置布局为网格布局
		
		JPanel logPanel = new JPanel() ;         //创建面板：布局用户名部分
		JPanel PasswordPanel = new JPanel();		//创建面板：布局密码部分
		JPanel buttonPanel = new JPanel();		//创建面板：布局按钮部分
		
		JLabel wordLabel = new JLabel("Please Login!", JLabel.CENTER);
		wordLabel.setFont(new Font("黑体",Font.BOLD,17));
		JLabel logLabel = new JLabel("用户名");
		JLabel PasswordLabel = new JLabel("密    码");
		logName = new JTextField(15);               //创建用户名文本框
		password =new JPasswordField(15);		//创建密码框
		JButton logButton = new JButton("登录"); 
		JButton exitButton = new JButton("退出");
		
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
		
		logButton.addActionListener(new ActionListener() {	// 注册监听器
			public void actionPerformed(ActionEvent e) {
				if(logName.getText().equals("Java") &&	new String(password.getPassword()).equals("2020"))
					JOptionPane.showMessageDialog(null, "登录成功，欢迎使用","", JOptionPane.PLAIN_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null, "信息有误，请重新输入","", JOptionPane.ERROR_MESSAGE);					
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);   //关闭程序
			}
		});				
		setSize(300,250);
		setVisible(true);    //设置窗体可见
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
		public static void main(String[] args) {
		new Login();			
	}	
}
