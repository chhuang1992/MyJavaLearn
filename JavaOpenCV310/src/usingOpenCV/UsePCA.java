package usingOpenCV;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
//import org.opencv.imgproc.*;
//import org.opencv.calib3d.*;
//import org.opencv.objdetect.*;;


public class UsePCA {

	public final static double SCALE = 0.2;
	
	public static void drawAxis( Mat img, Point p, Point q, Scalar colour){
		double angle;
	    double hypotenuse;
	    angle = Math.atan2( (double) p.y - q.y, (double) p.x - q.x ); // angle in radians
	    hypotenuse = Math.sqrt( (double) (p.y - q.y) * (p.y - q.y) + (p.x - q.x) * (p.x - q.x));
	    
	    q.x = (int) (p.x - SCALE * hypotenuse * Math.cos(angle));
	    q.y = (int) (p.y - SCALE * hypotenuse * Math.sin(angle));
	    //line(img, p, q, colour, 1, CV_AA);
	    Imgproc.line(img, p, q, colour, 1, Core.LINE_AA,0);
	    
	    p.x = (int) (q.x + 9 * Math.cos(angle + Math.PI / 4));
	    p.y = (int) (q.y + 9 * Math.sin(angle + Math.PI / 4));
	    Imgproc.line(img, p, q, colour, 1, Core.LINE_AA,0);

	    p.x = (int) (q.x + 9 * Math.cos(angle - Math.PI / 4));
	    p.y = (int) (q.y + 9 * Math.sin(angle - Math.PI / 4));
	    Imgproc.line(img, p, q, colour, 1, Core.LINE_AA,0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.loadLibrary("opencv_java310");
		Mat img = Imgcodecs.imread("data/lena.jpg");
		Point A = new Point(50,50);
		Point B = new Point(350,50);
		Scalar colour = new Scalar(255,0,0) ;
		Imgproc.line(img, A, B, colour, 1, Core.LINE_AA,0);
		drawAxis(img,A,B,colour);
		Imgcodecs.imwrite("data/picLine.jpg", img);
		
	}
	
	

}
