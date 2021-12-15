package ch10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.*;

import javax.swing.*;

public class Music {
	 public static void main(String[] args) {
		
	 new MusicWindow();
	 }
}
class MusicWindow extends JFrame implements ActionListener
{
	JButton[]musicbButtons;
	File musicFile;
	URI uri;
	URL url;
	AudioClip clip;
	String[]musicStrings={"1.au","2.au","3.au","4.au","5.au"};
	MusicWindow(){
		musicbButtons=new JButton[5];
		Box musicBox=Box.createHorizontalBox();
		for(int i=0;i<musicbButtons.length;i++)
		{
			musicbButtons[i]=new JButton(""+(i+1));
			musicbButtons[i].addActionListener(this);
			musicBox.add(musicbButtons[i]);
		}
		setLayout(new FlowLayout());
		add(musicBox);
		setBounds(320, 125, 350, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ÒôÀÖ²¥·ÅÆ÷");
	
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton)e.getSource();
		//if(clip!=null)
			//clip.stop();
		for(int i=0;i<musicbButtons.length;i++)
		{

		if (button==musicbButtons[i])
		{musicFile=new File(musicStrings[i]);
		uri=musicFile.toURI();
		try {
			url=uri.toURL();
		}
		catch ( Exception exp) {		}
		
		}
		}
		clip=Applet.newAudioClip(url);
		clip.play();
	}
}











