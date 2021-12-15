package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//��Ϸ�����
public class GamePanel extends JPanel implements KeyListener, ActionListener {


    //�����ߵ����ݽṹ
    int lenght; //�ߵĳ���
    int[]  snakeX=new int[600];//�ߵ�x����25*25
    int[]  snakeY=new int[500];//�ߵ�y����25*25
    String fx="R";//��ʼ����  ����

    //ʳ�������
    int foodx;
    int foody;
    Random random=new Random();

    int score;//�ɼ�

    //��Ϸ��ǰ��״̬  ��ʼ---ֹͣ
    boolean isStart=false;//Ĭ�ϲ���ʼ

    boolean isFail=false;//��Ϸʧ��״̬

    //��ʱ�� �Ժ���Ϊ��λ 1000ms=1s
    Timer timer=new Timer(80,this);//�����������80����ִ��һ��
    //������
    public GamePanel(){
        init();
        
        //��ý���ͼ����¼�
        this.setFocusable(true);//��ý����¼�
        this.addKeyListener(this);//��ü��̼����¼�
        timer.start();//��Ϸһ��������ʱ��������
    }

    //��ʼ������
    public void init(){
        lenght=3;
        snakeX[0]=100; snakeY[0]=100;//�Դ�����
        snakeX[1]=75; snakeY[1]=100;//��һ����������
        snakeX[2]=50; snakeY[2]=100;//�ڶ�����������
        fx="R";

        //��ʳ������ֲ��ڽ�����
        foodx=25+25*random.nextInt(34); //800/25=34
        foody=75+25*random.nextInt(24);  //600/25=24

        //��ʼ����
        score=0;

    }


    //������壬������Ϸ�е����ж�����ʹ�������������
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  //����
        this.setBackground(Color.WHITE);
        //���ƾ�̬���
        Data.header.paintIcon(this,g,100,10);//ͷ�������
       
        g.fillRect(25,75,850,600);  //Ĭ����Ϸ����
       
   
        //������
        g.setColor(Color.red);
        g.setFont(new Font("΢���ź�",Font.BOLD,18));
        g.drawString("����:"+lenght,750,35);
        g.drawString("����:"+score,750,50);


        //��ʳ��
        Data.food.paintIcon(this,g,foodx,foody);
         //��С�߻���ȥ��������ǰ�����--��g��ֻ�ʻ�--����x,y
        if(fx.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);//��ͷ��ʼ������,����ȥ����Ҫͨ���������ж�
        }else if(fx.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);//��ͷ��ʼ������,����ȥ����Ҫͨ���������ж�
        }else if(fx.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);//��ͷ��ʼ������,����ȥ����Ҫͨ���������ж�
        }else if(fx.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);//��ͷ��ʼ������,����ȥ����Ҫͨ���������ж�
        }
        for (int i = 1; i < lenght; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);//��i����������
        }

        //��Ϸ״̬
        if(!isStart){
            g.setColor(Color.WHITE);
            
            //��������
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("���¿ո�ʼ��Ϸ",300,300);
        }


        if (isFail) {
            g.setColor(Color.RED);
            //��������
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("��Ϸʧ�ܣ����¿ո����¿�ʼ��",300,300);
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
    //���̼����¼�
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//���̰�������һ��
        if(keyCode==KeyEvent.VK_SPACE){ //������µ��ǿո��
         if (isFail){
            isFail=false; //�����¿�ʼ
             init();
         }else{
            isStart=!isStart; //ȡ��
         }
         repaint();
        }
        //С���ƶ�
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

    //�¼�����--��Ҫͨ���̶���ʱ����ˢ�£���1s10��
    @Override
    public void actionPerformed(ActionEvent e) {
         if (isStart&&isFail==false ){//�����Ϸ�ǿ�ʼ״̬������С�߶�����
             //��ʳ��
             if (snakeX[0]==foodx&&snakeY[0]==foody){
                 lenght++;//���ȼ�1
                 //����+10
                 score+=10;
                 //�ٴγ������ʳ��
                 foodx=25+25*random.nextInt(34); //800/25=34
                 foody=75+25*random.nextInt(24);  //600/25=24
             }

             
             //�ƶ�
             for (int i = lenght-1; i > 0; i--) {//��һ��һ��ǰһ���λ��
                 snakeX[i]=snakeX[i-1];
                 snakeY[i]=snakeY[i-1];
             }
             //����
             if(fx.equals("R")){
                 snakeX[0]=snakeX[0]+25;
                 if(snakeX[0]>850){ snakeX[0]=25;} //�߽��ж�
             }else if(fx.equals("L")){
                 snakeX[0]=snakeX[0]-25;
                 if(snakeX[0]<25){ snakeX[0]=850;} //�߽��ж�
             }else if(fx.equals("U")){
                 snakeY[0]=snakeY[0]-25;
                 if(snakeY[0]<75){ snakeY[0]=650;} //�߽��ж�
             } else if(fx.equals("D")){
                 snakeY[0]=snakeY[0]+25;
                 if(snakeY[0]>650){ snakeY[0]=75;} //�߽��ж�
             }

             //ʧ���ж���ײ���Լ���ʧ��
             for (int i = 1; i < lenght; i++) {
                 if(snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]) {
                     isFail=true;
                 }
             }


             repaint(); //���»���ҳ��
         }
         timer.start();  //��ʱ������
    }
}

