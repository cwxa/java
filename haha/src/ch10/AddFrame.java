package ch10;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class AddFrame extends JFrame  {
    JTextField jtf1, jtf2, jtf3;
    JLabel jl;
    JButton jbAdd,jb2,jb3,jb4;
 
    public AddFrame() {
        //�ؼ��Ĵ���
    	
        jtf1 = new JTextField(10);
        jl = new JLabel("����");
       
        jtf2 = new JTextField(10);
        jbAdd = new JButton("��");
        jb2=new JButton("��");
        jb3=new JButton("��");
        jb4=new JButton("��");
        
        
        jbAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1+d2));//ת���ַ���
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "��ʾ:ֻ��������������,����Ϊ�ջ��������ַ�");
		        }
				
			}
		});
        jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1-d2));//ת���ַ���
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "��ʾ:ֻ��������������,����Ϊ�ջ��������ַ�");
		        }
				
			}
		});
        jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1*d2));//ת���ַ���
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "��ʾ:ֻ��������������,����Ϊ�ջ��������ַ�");
		        }
				
			}
		});
        jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1/d2));//ת���ַ���
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "��ʾ:ֻ��������������,����Ϊ�ջ��������ַ�");
		        }
				
			}
		});
        //����ť����¼���Ӧ
        
        jtf3 = new JTextField(10);
        jtf3.setEditable(false);//����ı����ܱ��༭
        
        add(jtf1);
        add(jl);
        add(jtf2);
        add(jbAdd);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jtf3);
        
        
        setLayout(new FlowLayout());//������ʽ����
        //setLayout(new GridLayout(2,4));
        //setLayout(new BorderLayout());
        
        setSize(300, 140);
        setTitle("������");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    //����ť�����ʱִ��actionPerformed����
    
    public static void main(String[] args) {
        new AddFrame();//��������
    }
 
}