package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏的面板
public class GamePanel extends JPanel implements KeyListener, ActionListener {


    //定义蛇的数据结构
    int lenght; //蛇的长度
    int[]  snakeX=new int[600];//蛇的x坐标25*25
    int[]  snakeY=new int[500];//蛇的y坐标25*25
    String fx="R";//初始方向  向右

    //食物的坐标
    int foodx;
    int foody;
    Random random=new Random();

    int score;//成绩

    //游戏当前的状态  开始---停止
    boolean isStart=false;//默认不开始

    boolean isFail=false;//游戏失败状态

    //定时器 以毫秒为单位 1000ms=1s
    Timer timer=new Timer(80,this);//监听这个对象，80毫秒执行一次
    //构造器
    public GamePanel(){
        init();
        
        //获得焦点和键盘事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//获得键盘监听事件
        timer.start();//游戏一开启，定时器就启动
    }

    //初始化方法
    public void init(){
        lenght=3;
        snakeX[0]=100; snakeY[0]=100;//脑袋坐标
        snakeX[1]=75; snakeY[1]=100;//第一个身体坐标
        snakeX[2]=50; snakeY[2]=100;//第二个身体坐标
        fx="R";

        //把食物随机分布在界面上
        foodx=25+25*random.nextInt(34); //800/25=34
        foody=75+25*random.nextInt(24);  //600/25=24

        //初始分数
        score=0;

    }


    //绘制面板，我们游戏中的所有东西都使用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  //清屏
        this.setBackground(Color.WHITE);
        //绘制静态面板
        Data.header.paintIcon(this,g,100,10);//头部广告栏
       
        g.fillRect(25,75,850,600);  //默认游戏界面
       
   
        //画积分
        g.setColor(Color.red);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度:"+lenght,750,35);
        g.drawString("分数:"+score,750,50);


        //画食物
        Data.food.paintIcon(this,g,foodx,foody);
         //将小蛇画上去，画到当前面板上--用g这只笔画--画到x,y
        if(fx.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右,接下去的需要通过方向来判断
        }else if(fx.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右,接下去的需要通过方向来判断
        }else if(fx.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右,接下去的需要通过方向来判断
        }else if(fx.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右,接下去的需要通过方向来判断
        }
        for (int i = 1; i < lenght; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);//第i个身体坐标
        }

        //游戏状态
        if(!isStart){
            g.setColor(Color.WHITE);
            
            //设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }


        if (isFail) {
            g.setColor(Color.RED);
            //设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败，按下空格重新开始！",300,300);
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//键盘按键是哪一个
        if(keyCode==KeyEvent.VK_SPACE){ //如果按下的是空格键
         if (isFail){
            isFail=false; //则重新开始
             init();
         }else{
            isStart=!isStart; //取反
         }
         repaint();
        }
        //小蛇移动
        if (keyCode==KeyEvent.VK_UP){
            fx="U";
        }else if(keyCode==KeyEvent.VK_DOWN){
            fx="D";
        }else if(keyCode==KeyEvent.VK_LEFT){
            fx="L";
        }else if(keyCode==KeyEvent.VK_RIGHT){
            fx="R";
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    //事件监听--需要通过固定的时间来刷新，如1s10次
    @Override
    public void actionPerformed(ActionEvent e) {
         if (isStart&&isFail==false ){//如果游戏是开始状态，就让小蛇动起来
             //吃食物
             if (snakeX[0]==foodx&&snakeY[0]==foody){
                 lenght++;//长度加1
                 //分数+10
                 score+=10;
                 //再次出现随机食物
                 foodx=25+25*random.nextInt(34); //800/25=34
                 foody=75+25*random.nextInt(24);  //600/25=24
             }

             
             //移动
             for (int i = lenght-1; i > 0; i--) {//后一项一到前一项的位置
                 snakeX[i]=snakeX[i-1];
                 snakeY[i]=snakeY[i-1];
             }
             //走向
             if(fx.equals("R")){
                 snakeX[0]=snakeX[0]+25;
                 if(snakeX[0]>850){ snakeX[0]=25;} //边界判断
             }else if(fx.equals("L")){
                 snakeX[0]=snakeX[0]-25;
                 if(snakeX[0]<25){ snakeX[0]=850;} //边界判断
             }else if(fx.equals("U")){
                 snakeY[0]=snakeY[0]-25;
                 if(snakeY[0]<75){ snakeY[0]=650;} //边界判断
             } else if(fx.equals("D")){
                 snakeY[0]=snakeY[0]+25;
                 if(snakeY[0]>650){ snakeY[0]=75;} //边界判断
             }

             //失败判定。撞到自己即失败
             for (int i = 1; i < lenght; i++) {
                 if(snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]) {
                     isFail=true;
                 }
             }


             repaint(); //重新绘制页面
         }
         timer.start();  //定时器开启
    }
}

