
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class Paddle {
	Enum  SIMPLE,STEEL;
	Image paddle=null;
	
	public Paddle(String type) throws SlickException
	{
		if(type=="SIMPLE")
		{
			
				paddle=new Image("paddle.png");
			
		}
		else if(type==STEEL.toString())
		{
			paddle= new Image("paddle.png");
		}
	}
	
	public void  draw(float x,float y)
	{
		paddle.draw(x, y);
	}
	public void rotate(float angle)
	{
		paddle.rotate(angle);
	}
	
	public void setRotation(float angle)
	{
		paddle.setRotation(angle);
	}
	
	public float getRotation()
	{
		return paddle.getRotation();
	}
	
	public void setCenterOfRotation(float x,float y)
	{
		paddle.setCenterOfRotation(x, y);
	}
}
