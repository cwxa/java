package ch10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonColor extends JFrame{
	private JPanel panel1;
	private JButton yellow,blue,green,pink;
	private Container content;
	
	public ButtonColor(){
		super("��ɫ��");
		content=getContentPane();
		panel1=new JPanel();
		yellow=new JButton("��ɫ");
		blue=new JButton("��ɫ");
		green=new JButton("��ɫ");
		pink=new JButton("��ɫ");
		panel1.add(yellow);
		panel1.add(blue);
		panel1.add(green);
		panel1.add(pink);
		yellow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				content.setBackground(Color.yellow);
			}
		});
		blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				content.setBackground(Color.blue);
			}
		});
		green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				content.setBackground(Color.green);
			}
		});
		pink.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				content.setBackground(Color.pink);
			}
		});
		content.add(panel1,BorderLayout.SOUTH);
		setVisible(true);
		setSize(500,200);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String args[]){
		ButtonColor app=new ButtonColor();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
