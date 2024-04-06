import java.awt.*;
class  LogoFrame extends Frame
{
	{
		this.setVisible(true);
		this.setTitle("Azzu Frame");
		this.setSize(500,500);
		this.setBackground(Color.red);
	}	
	   public void paint(Graphics  g) {
        Font f = new Font("arial", Font.BOLD, 30);
		g.setFont(f);
		this.setForeground(Color.red);
		g.drawString("Welcome to JVA GUI" ,   100,100);

		   }	}
	class Test
	{
	
	public static void main(String[] args) 
	{
		LogoFrame  lf = new LogoFrame();
		}
}
