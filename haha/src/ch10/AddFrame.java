package ch10;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class AddFrame extends JFrame  {
    JTextField jtf1, jtf2, jtf3;
    JLabel jl;
    JButton jbAdd,jb2,jb3,jb4;
 
    public AddFrame() {
        //控件的创建
    	
        jtf1 = new JTextField(10);
        jl = new JLabel("符号");
       
        jtf2 = new JTextField(10);
        jbAdd = new JButton("加");
        jb2=new JButton("减");
        jb3=new JButton("乘");
        jb4=new JButton("除");
        
        
        jbAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1+d2));//转成字符串
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "提示:只能输入两个数字,不能为空或者其他字符");
		        }
				
			}
		});
        jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1-d2));//转成字符串
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "提示:只能输入两个数字,不能为空或者其他字符");
		        }
				
			}
		});
        jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1*d2));//转成字符串
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "提示:只能输入两个数字,不能为空或者其他字符");
		        }
				
			}
		});
        jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try{
		            double d1 = Double.parseDouble(jtf1.getText());
		            double d2 = Double.parseDouble(jtf2.getText());
		            jtf3.setText(""+(d1/d2));//转成字符串
		        }catch(Exception ex){
		            JOptionPane.showMessageDialog(jtf3, "提示:只能输入两个数字,不能为空或者其他字符");
		        }
				
			}
		});
        //给按钮添加事件响应
        
        jtf3 = new JTextField(10);
        jtf3.setEditable(false);//结果文本框不能被编辑
        
        add(jtf1);
        add(jl);
        add(jtf2);
        add(jbAdd);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jtf3);
        
        
        setLayout(new FlowLayout());//窗口流式布局
        //setLayout(new GridLayout(2,4));
        //setLayout(new BorderLayout());
        
        setSize(300, 140);
        setTitle("计算器");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    //当按钮被点击时执行actionPerformed方法
    
    public static void main(String[] args) {
        new AddFrame();//启动窗口
    }
 
}