
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
public class Menu extends BasicGameState {
public String mouse  = "No Mouse";
	Menu m;
public Menu(int state){
	
	}
	 Image back ;
	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		
		 back = new Image("download.jpg");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		
             
              g.drawImage(back, 0, 0);
	          g.drawString(mouse, 50, 50);
	 	}
	
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
  int xpos = Mouse.getX();
  int ypos = Mouse.getY();
  mouse = "Mouse Position x: "+ xpos+ " y:"+ypos;
   if((xpos>930 && xpos<1152) && (ypos>410 && ypos<489)){
	  
	   //Go to tutorial
	   
	  	   if (Mouse.isButtonDown(0)){
		   sbg.enterState(1);
	   
		   
	   }
   }
   if((xpos>951 && xpos<1157) && (ypos>165 && ypos<260)){
	   if (Mouse.isButtonDown(0)){
		   System.exit(0); 
	   }
   
   }
   
   if((xpos>916 && xpos<1156) && (ypos>659 && ypos<730)){
		  
	   //Go to tutorial
	   
	  	   if (Mouse.isButtonDown(0)){
		   sbg.enterState(4);
	  	   }}
	}
   
	
		
	public int getID() {
		
		return 0;
	}

	
	

	

	

}
