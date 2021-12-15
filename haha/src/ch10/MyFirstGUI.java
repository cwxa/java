package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFirstGUI extends JFrame {
   private JButton plainButton, fancyButton;
   private Container contentpane;
   private Icon bug1,bug2;
   
   public MyFirstGUI()
   {  super( "GUI举例" );
   	  contentpane = getContentPane();
   	  contentpane.setLayout( new FlowLayout() );
      plainButton = new JButton( "文本按钮" );
      contentpane.add( plainButton );
      bug1 = new ImageIcon( getClass().getResource("bug1.gif" ));
      bug2 = new ImageIcon( getClass().getResource("bug2.gif" ));
      fancyButton = new JButton( "文本图像按钮", bug1 );  //fancyButton的默任图标bug何
      fancyButton.setRolloverIcon( bug2 );     //当鼠标置于该按钮上时,显示图标bug2
      contentpane.add( fancyButton );
      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );
      //setTitle("GUI举例");
      setSize( 275, 100 );
      setVisible( true );
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   private class ButtonHandler implements ActionListener {
	      public void actionPerformed( ActionEvent event )
	      {
	         JOptionPane.showMessageDialog( MyFirstGUI.this,
	            "你按下的是:  " + event.getActionCommand() );
	      }
	   		}
   public static void main( String args[] )
   { 
	  MyFirstGUI application = new MyFirstGUI();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
     }
	}