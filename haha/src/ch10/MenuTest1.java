package ch10;
// MenuTest.java
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;

public class MenuTest1 extends JFrame {
	
   private final Color colorValues[] = 
      { Color.black, Color.blue, Color.red, Color.green };  
   String colors[] = { "Black", "Blue", "Red", "Green" };    
   
   private JRadioButtonMenuItem backcolorItems[],colorItems[], fonts[];
   private JCheckBoxMenuItem styleItems[];
   private JTextField displayLabel;
   private ButtonGroup fontGroup, colorGroup;
   private int style;
   private Container content;

   // set up GUI
   public MenuTest1()
   {  super( " �˵�" );
       
      // ����JMenuBar�˵���������MenuTest������
      JMenuBar bar = new JMenuBar();  
      setJMenuBar( bar );     

      // ����JMenu�˵�File�����Ĳ˵���
      JMenu fileMenu = new JMenu( "File" );
      fileMenu.setMnemonic( 'F' );
      
      bar.add( fileMenu );  //���˵�fileMenu����˵���
      
      // ����JMenu�˵�haha�����Ĳ˵���
      JMenu hahaJMenu = new JMenu( "Haha" );
      hahaJMenu.setMnemonic( 'H' );
      bar.add( hahaJMenu );
      
   // haha�д���JMenuItem�˵���xixi 
      JMenuItem xixiItemItem = new JMenuItem( "Xixi" );
      xixiItemItem.setMnemonic( 'X' );  //���ÿ�ݼ�
      hahaJMenu.add( xixiItemItem );
      xixiItemItem.addActionListener( //���˵���aboutItemע���¼�������
         new ActionListener() {
            // ���û�ѡ��About...ʱ,��ʾ�Ի���
            public void actionPerformed( ActionEvent event )
            {
               JOptionPane.showMessageDialog( MenuTest1.this,
                  "ahah�ɹ���",
                  "About", JOptionPane.PLAIN_MESSAGE );
            }

      } );  
      
      

      // ����JMenuItem�˵���About... 
      JMenuItem aboutItem = new JMenuItem( "About..." );
      aboutItem.setMnemonic( 'A' );  //���ÿ�ݼ�
      fileMenu.add( aboutItem );
      aboutItem.addActionListener( //���˵���aboutItemע���¼�������
         new ActionListener() {
            // ���û�ѡ��About...ʱ,��ʾ�Ի���
            public void actionPerformed( ActionEvent event )
            {
               JOptionPane.showMessageDialog( MenuTest1.this,
                  "���ǲ˵�Ӧ�õ�����",
                  "About", JOptionPane.PLAIN_MESSAGE );
            }

      } );  
      // ����JMenuItem�˵���Exit,�����ÿ�ݼ�
      JMenuItem exitItem = new JMenuItem( "Exit", (int)'x');        
      fileMenu.add( exitItem );
      exitItem.addActionListener(
         new ActionListener() {
            // ���û�ѡ��exitItem,�����ж�����
            public void actionPerformed( ActionEvent event )
            { System.exit( 0 );
            }

       }); 
   // ����JMenu backJMenu
	JMenu backJMenu=new JMenu("back color");
	hahaJMenu.add(backJMenu);
	
	//ItemHandler�Զ�����
	ItemHandler itemHandler = new ItemHandler();
	 backcolorItems = new JRadioButtonMenuItem[ colors.length ];  //������������colorItems
    colorGroup = new ButtonGroup();
    
	for ( int count = 0; count < colors.length; count++ ) {
	    backcolorItems[ count ] = 
	       new JRadioButtonMenuItem( colors[ count ] );
	    backJMenu.add( backcolorItems[ count ] );
	    colorGroup.add( backcolorItems[ count ] );
	    backcolorItems[ count ].addActionListener( itemHandler );
	 }    

      

      //  �����˵�Format�������Ӳ˵�,�˵���
      JMenu formatMenu = new JMenu( "Format" );  
      formatMenu.setMnemonic( 'r' );

      // �����Ӳ˵� Color
      

      JMenu colorMenu = new JMenu( "Color" );
      colorMenu.setMnemonic( 'C' );

      colorItems = new JRadioButtonMenuItem[ colors.length ];  //������������colorItems
      colorGroup = new ButtonGroup();
      ItemHandler itemHandler2 = new ItemHandler();

      // ����Color�Ĳ˵���radiobutton
      for ( int count = 0; count < colors.length; count++ ) {
         colorItems[ count ] = 
            new JRadioButtonMenuItem( colors[ count ] );
         colorMenu.add( colorItems[ count ] );
         colorGroup.add( colorItems[ count ] );
         colorItems[ count ].addActionListener( itemHandler2 );
      }    
      colorItems[ 0 ].setSelected( true );  

      // //���˵�format����˵���
      formatMenu.add( colorMenu );   
      formatMenu.addSeparator();

      // ���� Font �Ӳ˵�
      String fontNames[] = { "Serif", "Monospaced", "SansSerif" };

      JMenu fontMenu = new JMenu( "Font" );
      fontMenu.setMnemonic( 'n' );

      fonts = new JRadioButtonMenuItem[ fontNames.length ];
      fontGroup = new ButtonGroup();

      // ����Font�Ĳ˵���radio button 
      for ( int count = 0; count < fonts.length; count++ ) {
         fonts[ count ] = new JRadioButtonMenuItem( fontNames[ count ] );
         fontMenu.add( fonts[ count ] );
         fontGroup.add( fonts[ count ] );
         fonts[ count ].addActionListener( itemHandler );
      }

      // select first Font menu item
      fonts[ 0 ].setSelected( true );

      fontMenu.addSeparator();

      // ���� style �˵���
      String styleNames[] = { "Bold", "Italic" };

      styleItems = new JCheckBoxMenuItem[ styleNames.length ];
      StyleHandler styleHandler = new StyleHandler();

      // create style checkbox menu items
      for ( int count = 0; count < styleNames.length; count++ ) {
         styleItems[ count ] = 
            new JCheckBoxMenuItem( styleNames[ count ] );
         fontMenu.add( styleItems[ count ] );
         styleItems[ count ].addItemListener( styleHandler );
      }

      // ���Ӳ˵�Font ����˵�Format��
      formatMenu.add( fontMenu );

      // ���˵�formatMenu����˵��� bar
      bar.add( formatMenu );  
     
      // ��Frame����������ϼ���һ label����,����ʾtext
      displayLabel = new JTextField( "Java����������õ�����", SwingConstants.CENTER );
      displayLabel.setForeground( colorValues[ 0 ] );
      
      displayLabel.setFont( new Font( "Serif", Font.PLAIN, 50 ) );
      content = getContentPane();
      
      getContentPane().setBackground( Color.CYAN );
      content.setBackground( Color.red );
      getContentPane().add( displayLabel, BorderLayout.CENTER );

      setSize( 800, 450 );
      setVisible( true );

   } 

   public static void main( String args[] )
   {
      MenuTest1 application = new MenuTest1();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // ���崦��radio button �˵����ϵ��¼�Action events ���ڲ���
   private class ItemHandler implements ActionListener {

      // ѡ��color �� font �Ĵ������
      public void actionPerformed( ActionEvent event )
      {
         // ѡ��color �Ĵ������
         for ( int count = 0; count < colorItems.length; count++ )
  
            if ( colorItems[ count ].isSelected() ) {
               displayLabel.setForeground( colorValues[ count ] );
               break;
            }
 
         // ѡ��font �Ĵ������
         for ( int count = 0; count < fonts.length; count++ )

            if ( event.getSource() == fonts[ count ] ) {
               displayLabel.setFont( 
                  new Font( fonts[ count ].getText(), style, 50 ) );
               break;
               
            }
         
         //
         for ( int count = 0; count < backcolorItems.length; count++ )
        	  
             if ( backcolorItems[ count ].isSelected() ) {
            	 getContentPane().setBackground( colorValues[ count ] );
                break;
             }
         //repaint();  

      } // end method actionPerformed

   } // end class ItemHandler

   //  ���崦�� check box �˵����ϵ��¼�Item events���ڲ���
   private class StyleHandler implements ItemListener {

      // process font style selections
      public void itemStateChanged( ItemEvent e )
      {
         style = 0;

         
         if ( styleItems[ 0 ].isSelected() )  // ��� bold��ѡ��
            style += Font.BOLD;

         
         if ( styleItems[ 1 ].isSelected() )  // ��� italic ��ѡ��
            style += Font.ITALIC;

         displayLabel.setFont( 
            new Font( displayLabel.getFont().getName(), style, 50 ) );

         //repaint();
      }

   } // end class StyleHandler

} // end class MenuTest
