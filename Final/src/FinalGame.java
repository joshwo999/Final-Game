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
		static boolean bounce=true;
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
	    @Override
		public void paint(Graphics g)
			{
				int c1x=20; int c1y=20;
				
				
				g.setColor(Color.white);
				g.fillRect(x,y,20,20);
				
				g.setColor(Color.yellow);
				g.fillOval(c1x, c1y, 20, 20);
				
				if((x==c1x)&&(c1y==20))
					{
						coin1=false;
						
					}
				if(coin1==false)
					{
						g.setColor(Color.black);
						g.fillOval(20, 20, 20, 20);
						
						
					
					int j=230;
					mj=5;
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
					mj=-mj;
					
							
					}

				g.setColor(Color.white);
				g.fillRect(x,y,20,20);
				
			}
		
		public void moveSquare(KeyEvent e)
			{
				switch(e.getKeyCode())
				{
					case KeyEvent.VK_DOWN:
						y += 5;
						break;
					case KeyEvent.VK_UP:
						y-= 5;
						break;
					case KeyEvent.VK_LEFT:
						x-=5;
						break;
					case KeyEvent.VK_RIGHT:
						x+=5;
						break;
				}
				repaint();
			}
		public static void main(String[] args)
			{
					JFrame frame = new JFrame("Basic Game");
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
					Thread.sleep(15);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
	}

