import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class FinalGame extends Canvas
	{
		
		//Some of the keyboard input came from user NRitH on Java Forums
		
		private static final long  serialVersionUID   =1L;
		
		static int x=230, y=230;
		static boolean coin1=true;
		static int coinsCollected=0;
		static int mj;
		static boolean gameOver=true;
		static boolean coin2=true;
	    public FinalGame() {
	        setSize(new Dimension(500, 500));
	        setBackground(Color.black);
	        addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent e) {
	                moveSquare(e);
	            }
	        });
	    }

		public void paint(Graphics g)
			{
				int c1x=50; int c1y=50;
				int fontSize=50;
				g.setColor(Color.red);
				g.fillRect(0, 0, 20, 500);
				
				g.setColor(Color.red);
				g.fillRect(0, 0, 500, 20);
				
				g.setColor(Color.red);
				g.fillRect(490, 0, 20, 500);
				
				g.setColor(Color.red);
				g.fillRect(0, 490, 510, 20);
				
				g.setColor(Color.white);
				g.fillRect(x,y,20,20);
				
				g.setColor(Color.yellow);
				g.fillRect(c1x, c1y, 20, 20);
				if((x==20)||(x==470)||(y==20)||(y==470))
					{
						while(gameOver)
							{
						g.setColor(Color.white);
						Font f=new Font("fantsy", Font.PLAIN, fontSize);
						g.setFont(f);
						g.drawString("GAME OVER", 100, 250);
							}
					}
				if((x>=50)&&(x<=70)&&(y>=50)&&(y<=70))
					{
						coin1=false;
						
					}
				if(coin1==false)
					{
						g.setColor(Color.black);
						g.fillRect(50, 50, 20, 20);
						
						g.setColor(Color.red);
						g.fillRect(200, 200, 100, 100);
						
						g.setColor(Color.yellow);
						g.fillRect(450, 450, 20, 20);
						if((x>=180)&&(x<=280)&&(y>=180)&&(y<=280))
							{
								while(gameOver)
									{
								g.setColor(Color.white);
								Font f=new Font("fantsy", Font.PLAIN, fontSize);
								g.setFont(f);
								g.drawString("GAME OVER", 100, 250);
									}
							}
						if((x>450)&&(x<470)&&(y>450)&&(y<470))
							{
								coin2=false;
								
							}
					}	
				if(coin2==false)
					{
						g.setColor(Color.black);
						g.fillRect(450, 450, 20, 20);
					}
					
					
					//int j=230;
					//mj=5;
					/*
					while(bounce)
						{		
							
							repaint();
							if((j==480)||(j==0))
								{
									mj=-mj;
								}
							
							j=j+mj;
							
							g.setColor(Color.red);
							g.fillRect(230, j, 20, 20);
							
							delay();
							
							g.setColor(Color.black);
							g.fillRect(230, j, 20, 20);
							
							g.setColor(Color.white);
							g.fillRect(x,y,20,20);
							
							
							
						}
						*/
					mj=-mj;
					
							
					

				g.setColor(Color.white);
				g.fillRect(x,y,20,20);
			}
			
		
		public void moveSquare(KeyEvent e)
			{
				switch(e.getKeyCode())
				{
					case KeyEvent.VK_DOWN:
						y += 1;
						break;
					case KeyEvent.VK_UP:
						y-= 1;
						break;
					case KeyEvent.VK_LEFT:
						x-=1;
						break;
					case KeyEvent.VK_RIGHT:
						x+=1;
						break;
				}
				
				repaint();
			}
		public static void main(String[] args)
			{
					JFrame frame = new JFrame("Final Game");
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    
			        FinalGame ex = new FinalGame();
			        frame.getContentPane().add(ex);
			        frame.pack();
			        frame.setResizable(false);
			        frame.setVisible(true);
			        ex.requestFocus();
			
		    
			}
		public void delay()
			{
	        try
					{
					Thread.sleep(50);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}

