import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.*;


public class friction3 extends BasicGameState {

		Image friction3;
	
	public String mouse1;
	
	public double xpos; 
	public double ypos;
	
	public friction3(int state){
	
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		
				friction3 = new Image("Friction3.png");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
		g.drawImage(friction3,0,0);
		g.drawString(mouse1,50, 50);
		
		 
			}
	
	
	        public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException 
			{
		 
			int xpos = Mouse.getX();
			int ypos = Mouse.getY();
			mouse1 = " x: "+ xpos+ " y:"+ypos;
				
		  		
				if((xpos>13 && xpos<54) && (ypos>8 && ypos<28))
				{
					 // Go to Main Menu
					   
			      if (Mouse.isButtonDown(0))
			      {
					  		 
					  sbg.enterState(0);}
			      }
			}
					  	   
					  	   
					  	 //  }
					  	   
			   //Go to tutorial
			   
			  	   //if (Mouse.isButtonDown(0)){
				  // System.exit(0);
			  	 // }
	//}
			   
	
	
		
	public int getID() {
		
		return 2;
	}

}
	