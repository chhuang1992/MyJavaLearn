package usingOpenCV;

import processing.core.*;

public class ShowImage extends PApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PImage photoLocal;

	public void setup() {
		size(390, 567);
		/*String url="https://processing.org/img/processing-web.png";
	  	photo = loadImage(url,"png");*/
		background(200,200,200);
		stroke(0);   //set pen color
		photoLocal = loadImage("faceDetection.png");
	}

	public void draw() {
		//image(photo, 0, 0);
		photoLocal.resize(0, height);
		image(photoLocal, 0, 0);
	}
}
