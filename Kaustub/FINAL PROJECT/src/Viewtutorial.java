import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.*;
public class Viewtutorial extends BasicGameState {

	Image friction1;
		
	public String mouse1;
	
	public double xpos; 
	public double ypos;
	
	public Viewtutorial(int state){
	
	}
	
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		
		friction1 = new Image("Friction1.jpg");
		
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
		g.drawImage(friction1,0,0);
		g.drawString(mouse1,1050, 78);
		
		 	
	}
	
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		 
		int xpos = Mouse.getX();
		  int ypos = Mouse.getY();
				mouse1 = " x: "+ xpos+ " y:"+ypos;
		  		
				if((xpos>29 && xpos<138) && (ypos>5 && ypos<46)){
					  
					   //Go to friction3
					   
					  	   if (Mouse.isButtonDown(0)){
					  		 
					  	   sbg.enterState(2);
					  	    }}
					  	   if((xpos>163 && xpos<269) && (ypos>9 && ypos<45)){
					  	   
			                      //Go to Main Menu
			   
			  	   if (Mouse.isButtonDown(0)){
				  sbg.enterState(0);
			  	   }
			  	   }
					  	 
			  	   
	}
			   
	
	
		
	public int getID() {
		
		return 1;
	}

}
	