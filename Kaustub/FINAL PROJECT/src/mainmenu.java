
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;


public class mainmenu extends StateBasedGame{
	
	
	public static final String gamename= "ANGRY BALLS 1.0";
	public static final int menu = 0;
	public static final int viewtutorial = 1;
	public static final int friction3 = 2;
	public static final int angryballs = 4;
	//public static final int mass = 3;
    //public static final int weight = 4;
	
	public mainmenu(String gamename) {
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Viewtutorial(viewtutorial));
		this.addState(new friction3(friction3));
		this.addState(new AngryBalls(angryballs));
		//this.addState(new Weight(weight));
	
	}
	
	public static void main(String[] args) {
		
        AppGameContainer appgc;
        try{
        	  
        	appgc = new AppGameContainer(new mainmenu(gamename));
        	appgc.setDisplayMode(1200, 800, false);
        	appgc.start();
        }
        
        catch(SlickException e){
        	e.printStackTrace();
        	
        }
}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc,this);
		this.getState(viewtutorial).init(gc,this);
		this.getState(friction3).init(gc,this);
		this.getState(angryballs).init(gc,this);
				this.enterState(menu);
	}

	

	
}