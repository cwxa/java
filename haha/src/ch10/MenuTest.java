package ch10;
// MenuTest.java
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;

public class MenuTest extends JFrame {
	
   private final Color colorValues[] = 
      { Color.black, Color.blue, Color.red, Color.green };  
   String colors[] = { "Black", "Blue", "Red", "Green" };    
   
   private JRadioButtonMenuItem backcolorItems[],colorItems[], fonts[];
   private JCheckBoxMenuItem styleItems[];
   private JLabel displayLabel;
   private ButtonGroup fontGroup, colorGroup;
   private int style;
   private Container content;

   // set up GUI
   public MenuTest()
   {  super( " 菜单" );
       
      // 创建JMenuBar菜单栏并置于MenuTest窗体中
      JMenuBar bar = new JMenuBar();  
      setJMenuBar( bar );     

      // 创建JMenu菜单File和它的菜单项
      JMenu fileMenu = new JMenu( "File" );
      fileMenu.setMnemonic( 'F' );
      
      bar.add( fileMenu );  //将菜单fileMenu加入菜单栏
      
      // 创建JMenu菜单haha和它的菜单项
      JMenu hahaJMenu = new JMenu( "Haha" );
      hahaJMenu.setMnemonic( 'H' );
      bar.add( hahaJMenu );
      
   // haha中创建JMenuItem菜单项xixi 
      JMenuItem xixiItemItem = new JMenuItem( "Xixi" );
      xixiItemItem.setMnemonic( 'X' );  //设置快捷键
      hahaJMenu.add( xixiItemItem );
      xixiItemItem.addActionListener( //给菜单项aboutItem注册事件监听器
         new ActionListener() {
            // 当用户选中About...时,显示对话框
            public void actionPerformed( ActionEvent event )
            {
               JOptionPane.showMessageDialog( MenuTest.this,
                  "ahah成功了",
                  "About", JOptionPane.PLAIN_MESSAGE );
            }

      } );  
      
      

      // 创建JMenuItem菜单项About... 
      JMenuItem aboutItem = new JMenuItem( "About..." );
      aboutItem.setMnemonic( 'A' );  //设置快捷键
      fileMenu.add( aboutItem );
      aboutItem.addActionListener( //给菜单项aboutItem注册事件监听器
         new ActionListener() {
            // 当用户选中About...时,显示对话框
            public void actionPerformed( ActionEvent event )
            {
               JOptionPane.showMessageDialog( MenuTest.this,
                  "这是菜单应用的例子",
                  "About", JOptionPane.PLAIN_MESSAGE );
            }

      } );  
      // 创建JMenuItem菜单项Exit,并设置快捷键
      JMenuItem exitItem = new JMenuItem( "Exit", (int)'x');        
      fileMenu.add( exitItem );
      exitItem.addActionListener(
         new ActionListener() {
            // 当用户选中exitItem,程序中断运行
            public void actionPerformed( ActionEvent event )
            { System.exit( 0 );
            }

       }); 
   // 创建JMenu backJMenu
	JMenu backJMenu=new JMenu("back color");
	hahaJMenu.add(backJMenu);
	
	//ItemHandler自定义类
	ItemHandler itemHandler = new ItemHandler();
	 backcolorItems = new JRadioButtonMenuItem[ colors.length ];  //创建数组引用colorItems
    colorGroup = new ButtonGroup();
    
	for ( int count = 0; count < colors.length; count++ ) {
	    backcolorItems[ count ] = 
	       new JRadioButtonMenuItem( colors[ count ] );
	    backJMenu.add( backcolorItems[ count ] );
	    colorGroup.add( backcolorItems[ count ] );
	    backcolorItems[ count ].addActionListener( itemHandler );
	 }    

      

      //  创建菜单Format和它的子菜单,菜单项
      JMenu formatMenu = new JMenu( "Format" );  
      formatMenu.setMnemonic( 'r' );

      // 创建子菜单 Color
      

      JMenu colorMenu = new JMenu( "Color" );
      colorMenu.setMnemonic( 'C' );

      colorItems = new JRadioButtonMenuItem[ colors.length ];  //创建数组引用colorItems
      colorGroup = new ButtonGroup();
      ItemHandler itemHandler2 = new ItemHandler();

      // 创建Color的菜单项radiobutton
      for ( int count = 0; count < colors.length; count++ ) {
         colorItems[ count ] = 
            new JRadioButtonMenuItem( colors[ count ] );
         colorMenu.add( colorItems[ count ] );
         colorGroup.add( colorItems[ count ] );
         colorItems[ count ].addActionListener( itemHandler2 );
      }    
      colorItems[ 0 ].setSelected( true );  

      // //将菜单format加入菜单栏
      formatMenu.add( colorMenu );   
      formatMenu.addSeparator();

      // 创建 Font 子菜单
      String fontNames[] = { "Serif", "Monospaced", "SansSerif" };

      JMenu fontMenu = new JMenu( "Font" );
      fontMenu.setMnemonic( 'n' );

      fonts = new JRadioButtonMenuItem[ fontNames.length ];
      fontGroup = new ButtonGroup();

      // 创建Font的菜单项radio button 
      for ( int count = 0; count < fonts.length; count++ ) {
         fonts[ count ] = new JRadioButtonMenuItem( fontNames[ count ] );
         fontMenu.add( fonts[ count ] );
         fontGroup.add( fonts[ count ] );
         fonts[ count ].addActionListener( itemHandler );
      }

      // select first Font menu item
      fonts[ 0 ].setSelected( true );

      fontMenu.addSeparator();

      // 创建 style 菜单项
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

      // 将子菜单Font 加入菜单Format中
      formatMenu.add( fontMenu );

      // 将菜单formatMenu加入菜单栏 bar
      bar.add( formatMenu );  
     
      // 在Frame的内容面板上加入一 label对象,以显示text
      displayLabel = new JLabel( "Java是世界上最好的语言", SwingConstants.CENTER );
      displayLabel.setForeground( colorValues[ 1 ] );
       content = getContentPane();
      displayLabel.setFont( new Font( "Serif", Font.PLAIN, 50 ) );

      content.setBackground( Color.red );
      getContentPane().add( displayLabel, BorderLayout.CENTER );

      setSize( 800, 450 );
      setVisible( true );

   } 

   public static void main( String args[] )
   {
      MenuTest application = new MenuTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // 定义处理radio button 菜单项上的事件Action events 的内部类
   private class ItemHandler implements ActionListener {

      // 选中color 和 font 的处理代码
      public void actionPerformed( ActionEvent event )
      {
         // 选中color 的处理代码
         for ( int count = 0; count < colorItems.length; count++ )
  
            if ( colorItems[ count ].isSelected() ) {
               displayLabel.setForeground( colorValues[ count ] );
               break;
            }
 
         // 选中font 的处理代码
         for ( int count = 0; count < fonts.length; count++ )

            if ( event.getSource() == fonts[ count ] ) {
               displayLabel.setFont( 
                  new Font( fonts[ count ].getText(), style, 50 ) );
               break;
               
            }
         
         //
         for ( int count = 0; count < backcolorItems.length; count++ )
        	  
             if ( backcolorItems[ count ].isSelected() ) {
                content.setBackground( colorValues[ count ] );
                //getContentPane().setBackground( Color.red );
                		
                break;
             }
         //repaint();  

      } // end method actionPerformed

   } // end class ItemHandler

   //  定义处理 check box 菜单项上的事件Item events的内部类
   private class StyleHandler implements ItemListener {

      // process font style selections
      public void itemStateChanged( ItemEvent e )
      {
         style = 0;

         
         if ( styleItems[ 0 ].isSelected() )  // 如果 bold被选中
            style += Font.BOLD;

         
         if ( styleItems[ 1 ].isSelected() )  // 如果 italic 被选中
            style += Font.ITALIC;

         displayLabel.setFont( 
            new Font( displayLabel.getFont().getName(), style, 50 ) );

         //repaint();
      }

   } // end class StyleHandler

} // end class MenuTest
