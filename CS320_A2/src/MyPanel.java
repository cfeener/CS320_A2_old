import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

//'e' for empty,
//'w' for white,
//'b' for black.
public class MyPanel extends JPanel {

	final char [][] grid= new char [15][15];
	/**
	 * Create the panel.
	 */
	public MyPanel() {
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		//Drawlines
		int offset= getHeight()/30;
		for(int i=0; i<15; i++){
			g.drawLine(0, i*getHeight()/15+offset, getWidth()+offset, i*getHeight()/15+offset);
			g.drawLine(i*getWidth()/15+offset, 0, i*getWidth()/15+offset, getWidth()+offset);
		}
		
		for(int i=0; i<15; i++){
			for (int j=0; j<15; j++){
				if(grid[i][j]=='w'){
					g.setColor(Color.white);
					g.drawOval(getWidth()/10, getHeight()/10, getWidth(), getHeight());
				}
			}
		}
	}
	
	public void init(){
		for (int i=0; i<15; i++){
			for(int j=0; j<15; j++){
				grid[i][j]= 'e';	//Empty
			}
		}
	}

}
