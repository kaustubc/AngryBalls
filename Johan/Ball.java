
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Ball extends Sprite
{

	float scale=1f;
	//float rotation=0f;  //face downward
	float hip=180f;
	int x;
	int y;
	
	Image ball = null;
	
	public Ball() throws SlickException
	{
		ball = new Image("images/yellowball.png");
		ball.rotate(hip);
	}
	
	public void drop(float x, float y, float scale)
	{				
		ball.draw(x,y,scale);
		this.x = (int) x;
		this.y = (int) y;
	}

	public void setRotation(float hip)
	{				
		this.hip = hip;
		ball.rotate(hip);
	}
	
	public float getRotation() {
		return ball.getRotation();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Image getBallImage()
	{
		return ball;
	}
	
}


