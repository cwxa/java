package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFirstGUI extends JFrame {
   private JButton plainButton, fancyButton;
   private Container contentpane;
   private Icon bug1,bug2;
   
   public MyFirstGUI()
   {  super( "GUI����" );
   	  contentpane = getContentPane();
   	  contentpane.setLayout( new FlowLayout() );
      plainButton = new JButton( "�ı���ť" );
      contentpane.add( plainButton );
      bug1 = new ImageIcon( getClass().getResource("bug1.gif" ));
      bug2 = new ImageIcon( getClass().getResource("bug2.gif" ));
      fancyButton = new JButton( "�ı�ͼ��ť", bug1 );  //fancyButton��Ĭ��ͼ��bug��
      fancyButton.setRolloverIcon( bug2 );     //��������ڸð�ť��ʱ,��ʾͼ��bug2
      contentpane.add( fancyButton );
      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );
      //setTitle("GUI����");
      setSize( 275, 100 );
      setVisible( true );
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   private class ButtonHandler implements ActionListener {
	      public void actionPerformed( ActionEvent event )
	      {
	         JOptionPane.showMessageDialog( MyFirstGUI.this,
	            "�㰴�µ���:  " + event.getActionCommand() );
	      }
	   		}
   public static void main( String args[] )
   { 
	  MyFirstGUI application = new MyFirstGUI();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
     }
	}