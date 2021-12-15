package ch10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonTest extends JFrame {
   private JButton plainButton, fancyButton;
   // set up GUI
   public ButtonTest()
   {  super( "JButton�ĳ������" );

      // get content pane and set its layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // create buttons
      plainButton = new JButton( "�ı���ť" );
      container.add( plainButton );

      Icon bug1 = new ImageIcon( getClass().getResource("bug1.gif" ));
      Icon bug2 = new ImageIcon( getClass().getResource("bug2.gif" ));
      fancyButton = new JButton( "�ı�ͼ��ť", bug1 );  //fancyButton��Ĭ��ͼ��bug��
      fancyButton.setRolloverIcon( bug2 );     //��������ڸð�ť��ʱ,��ʾͼ��bug2
      container.add( fancyButton );

      // create an instance of inner class ButtonHandler
      // to use for button event handling 
      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );

      setSize( 275, 100 );
      setVisible( true );

   } // end ButtonTest constructor

   public static void main( String args[] )
   { 
      ButtonTest application = new ButtonTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener {

      // handle button event
      public void actionPerformed( ActionEvent event )
      {
         JOptionPane.showMessageDialog( ButtonTest.this,
            "�㰴�µ���:  " + event.getActionCommand() );
      }

   } // end private inner class ButtonHandler

} // end class ButtonTest


