/*
This was done by KC
*/
  
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
  
public class AngryBalls extends BasicGameState{
   
	
    float pos[][][]=new float[20][2][4];
		
		
	
    Image background = null;
    Paddle paddle1=null;
    Paddle paddle2=null;
    Ball ball1=null;
    Ball ball2=null;
    Image brick1=null,brick2 =null;
  static  float x1=0,y1=67;
   static float x2=460 , y2=67;
   static int loc1=1,loc2=1;
   public String mouse1;
   float scale = 1;
  
  /* public AngryBalls(int i)
   {
   		
   }
   */
   public AngryBalls(int i)
    {
        
    }
    
   

    public void init(GameContainer gc,StateBasedGame sbg)
            throws SlickException {
        
        background = new Image("backimg.jpg");
        
       
        
        
        
        paddle1=new Paddle("SIMPLE");
        paddle1.setCenterOfRotation(0, 0);
    	ball1=new Ball("SIMPLE");
   
    	
        paddle2=new Paddle("SIMPLE");
        ball2=new Ball("SIMPLE");
      brick1 =new Image("bricks.jpg");
      brick2= new Image("bricks.jpg");
        
        paddle2.setCenterOfRotation(200, 0);
       
        
        paddle1.setRotation(30);
   	 	paddle2.setRotation(-30);
   	 
        
    }
  
  
    
    public void update(GameContainer gc,StateBasedGame sbg, int delta)
            throws SlickException
    {
       
    	int xpos = Mouse.getX();
		  int ypos = Mouse.getY();
				mouse1 = " x: "+ xpos+ " y:"+ypos;    	
				if((xpos>1003 && xpos<1172) && (ypos>192 && ypos<237))
				
				{
					if (Mouse.isButtonDown(0))
					{
						sbg.enterState(0);
					}
				}
    
			  
				Input input = gc.getInput();
        
       
        	  
        if(input.isKeyDown(Input.KEY_Z))
        {
            if(paddle1.getRotation()>-20)  
            	paddle1.rotate(-2);
            
        	if(Math.sqrt(x1*x1+(y1-100)*(y1-100))>200 )
        	{
        		float hip = 0.2f * delta;
        		
        		 y1+= hip * Math.sin(Math.toRadians(30.0));
        		 x1+= 0.5*hip * Math.cos(Math.toRadians(30.0));
        		 
        	}
        	else //if(y1 > 110 && y1 < 210 && x1<200)
        	{
        		float hip = 1.0f * delta;
        		if(y1>32.5)
        		{
        			y1-=(float)(hip*Math.sin(Math.toRadians(30-paddle1.getRotation())));
        			
        		}
        		else if(loc1==0)
        		{
        			
        			y1+=(float) (hip * Math.sin(Math.toRadians(30)))+(hip*Math.toRadians(30-paddle1.getRotation()));
        			if(y1>100)
        				loc1=1;
        		}
        		else
        		{	
        		
        			if(loc1==1)
        			{
        				if(y1<60)
        				y1+=(float) (hip * Math.sin(Math.toRadians(30)))+(hip*Math.toRadians(30-paddle1.getRotation()));
            			
        				loc1=0;
        			}
        		}
        			System.out.println("the angle is"+ 200*Math.sin(Math.toRadians(-20)));
        		x1+=hip * Math.sin(Math.toRadians(paddle1.getRotation()));
        		
        		
        				
        		
        		
        				
        	}
               	
        }
        
        if(input.isKeyDown(Input.KEY_Z)==false )
    	{
        	
    		paddle1.setRotation(30);
    		float hip = 0.2f * delta;
    		  
            float rotation = paddle1.getRotation();
            
           
            if(x1 <179)
            {
            x1+= hip * Math.cos(Math.toRadians(rotation));
            }
            else
            	x1+=0.5*hip*Math.cos(Math.toRadians(rotation));
            
           //if(y1<90)
        	 //  y1= (float)(hip * Math.sin(Math.toRadians(30.0)));
            y1+= hip * Math.sin(Math.toRadians(rotation));
        	   
            
    	}
        
        
       
   //   724307877645
        
        if(input.isKeyDown(Input.KEY_M))
        {	
        	if(paddle2.getRotation()<20)
        	paddle2.rotate(2);
        	if(y2>210)
        	{
        		float hip = 0.2f * delta;
        		x2-=0.5*hip * Math.cos(Math.toRadians(-30));
                y2-= hip * Math.sin(Math.toRadians(-30));
            	   
        	}
        	
        	int temp = (int) (x2-300);
        	if(temp<0)
        		temp=0;
        	if(Math.sqrt((temp)*(temp)+(y2-100)*(y2-100)) > 200)
        	{
        		float hip = 0.2f * delta;
        		if(y2<50)
        		 y2-= hip * Math.sin(Math.toRadians(-30.0));
        		 x2-= 0.5*hip * Math.cos(Math.toRadians(-30.0));
        		 
        	}
        	else 
        	{
        		float hip = 1.0f * delta;
        		if(y2>32.5 && x2>300)
        		{
        			y2-=(float)(hip*Math.sin(Math.toRadians(30-paddle2.getRotation())));
        			
        		}
        		else if(loc2==0)
        		{
        			
        			y2+=(float) (hip * Math.sin(Math.toRadians(30)))+(hip*Math.toRadians(30-paddle2.getRotation()));
        			if(y2>100)
        				loc2=1;
        		}
        		else
        		{	
        		
        			if(loc2==1)
        			{
        				
        				y2+=(float) (hip * Math.sin(Math.toRadians(30)))+(hip*Math.toRadians(30-paddle2.getRotation()));
            			
        				loc2=0;
        			}
        		}
        			System.out.println("the angle is"+ 200*Math.sin(Math.toRadians(-20)));
        		x2+=hip * Math.sin(Math.toRadians(paddle2.getRotation()));
        		
        		
        				
        		
        		
        				
        	}
        
        	
        }
        if(input.isKeyDown(Input.KEY_M)==false)
    	{
    		paddle2.setRotation(-30);
    		
    		float hip = 0.2f * delta;
  		  
            float rotation = paddle2.getRotation();
           
            if(x2 > 301)
            {
            x2-= hip * Math.cos(Math.toRadians(rotation));
            }
            else
            	x2-=0.5*hip * Math.cos(Math.toRadians(rotation));
            
            y2-= hip * Math.sin(Math.toRadians(rotation));
        	   
            
    	}
        
        if(input.isKeyDown(Input.KEY_A))
        {
           
        }
  
        if(input.isKeyDown(Input.KEY_D))
        {
            
        }
      
    }
  
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
            throws SlickException
    {
    	
    	
    	    	g.drawImage(background,0,0);
    	g.drawImage(paddle1.paddle,0,100);
    	g.drawImage(ball1.ball,x1,y1);
    	g.drawImage(paddle2.paddle,300,100);
    	g.drawImage(ball2.ball,x2,y2);
    	g.drawImage(brick1,0,500);
    	g.drawImage(brick2,250,500);
    	g.drawString(mouse1,600, 20);
		/*
        background.draw(0,0);
        paddle1.draw(0,100);
        ball1.draw(x1,y1);
        paddle2.draw(300,100);
        ball2.draw(x2,y2);
        brick1.draw(0,500);
        brick2.draw(250,500);
       */
    }
    
 /* 
    public static void main(String[] args)
            throws SlickException
    {
         AppGameContainer app =
            new AppGameContainer( new AngryBalls() );
         
  
         app.setDisplayMode(500, 600, false);
         app.start();
    }
   */ 
public int getID() {
		
		return 4;
}








}