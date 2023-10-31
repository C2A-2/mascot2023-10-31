package mascot;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingUtilities;

public class Main{// extends JFrame implements MouseMotionListener, MouseListener {
	//ImageIcon icon = new ImageIcon("desktop.png");
	//JLabel label = new JLabel(icon);
	//JLabel label = new JLabel("こんにちわ");
	//JFrame frame = new JFrame();
	//Timer timer;
	Icon iconn =new Icon();
	Icon2 iconn2 =new Icon2();
	
	
	
	int x=1080,y=480;
	
	//画像切り替えチェック
	boolean check=true;
	
	
	
	

	public static void main(String[] args) {
		// 1, SwingUtilities.invokeLaterを使う。
		// 2, mouseExecのコンストラクタ内ではsetVisible(true);を行わない。
		SwingUtilities.invokeLater(() -> {
			new Main();//.setVisible(true);
		});
		
		
		
	}








	class MyTimer extends TimerTask {
        public void run(){
        	x-=10;
        	//y+=10;
        	
        	//チェック反転
        	if(check==false) {
        		check=true;
        	}else {
        		check=false;
        	}
        	
        	//画像切り替え
        	if(check==false) {
	        	iconn.label.setBounds(x, y, 200, 200);
	        	//label2.setVisible(false);
	        	iconn2.label2.setVisible(false);
	        	iconn.label.setVisible(true);
	        	System.out.println("タイマー処理1");
        	}else {
        		iconn2.label2.setBounds(x, y, 200, 200);
        		//label.setVisible(false);
        		iconn.label.setVisible(false);
	        	iconn2.label2.setVisible(true);
            	System.out.println("タイマー処理2");
        	}
        }
 }
		
	Main(){
		Timer timer = new Timer();
		timer.schedule(new MyTimer(),0,1000);
	}
	    
	 
	
	
}