import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Ball {

	Enum SIMPLE,BOMB;
	Image ball=null;
	
	public Ball(String type) throws SlickException
	{
		if(type=="SIMPLE")
		{
			ball=new Image("ball.png");
			
		}
		
		else if (type==BOMB.toString())
		{
			ball=new Image("ball.png");
		}
	}
	
	public void draw(float x,float y)
	{
		ball.draw(x, y);
	}
}
