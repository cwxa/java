package snake;
import javax.swing.*;

public class StartGame {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10,10,900,720);
        frame.setResizable(false);//窗口大小不变
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //正常游戏界面都应该在面板上！！！
        frame.add(new GamePanel());

    }

}
