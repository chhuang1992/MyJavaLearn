package learnGui;

import processing.core.*;

@SuppressWarnings("serial")
public class MyPApplet extends PApplet{
	//PImage photo;
	PImage photoLocal;

	public void setup() {
		size(400, 400);
		/*String url="https://processing.org/img/processing-web.png";
	  	photo = loadImage(url,"png");*/
		
		background(200,200,200);
		stroke(0);   //set pen color
		photoLocal = loadImage("data/palmTrees.jpg");
	}

	public void draw() {
		//image(photo, 0, 0);
		photoLocal.resize(0, height);
		image(photoLocal, 0, 0);
		int color[] = sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/5,height/5);
	}

	private int[] sunColorSec(int second) {
		// TODO Auto-generated method stub
		int [] rgb = new int[3];
		int diffFrom30 = Math.abs(30-second);
		double ratio = (double)diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		return rgb;
	}
}
