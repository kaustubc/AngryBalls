import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import java.util.*;

public class Block 
{
	
	float scale=1f;
	Image blockImg = null;
	Image blockSolidImg = null;
	int x=0;
	int y=0;
	
	public Block() throws SlickException
	{
		blockSolidImg = new Image("images/woodblocksmall.jpg");
		//blockImg = emptyImg;
	}		
	
	public void addBlock(float x, float y, int blockCode)
	{
		
	  blockImg=blockSolidImg;
		
		blockImg.draw(x,y);
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Image getBlockImage()
	{
		return blockImg;
	}
	
	public int getImageWidth()
	{
		return blockImg.getWidth();
	}
	
	public int getImageHeight()
	{
		return blockImg.getHeight();
	}
	
	public void destroy(float x, float y)
	{
		blockImg.draw(x,y,scale);
	}
	

}
