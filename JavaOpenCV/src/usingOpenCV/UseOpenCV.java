package usingOpenCV;

import org.opencv.core.*;
import org.opencv.highgui.*;
import org.opencv.objdetect.CascadeClassifier;

public class UseOpenCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.loadLibrary("opencv_java244");
		Mat A = Mat.eye(3,3,CvType.CV_8UC1);
		System.out.println(A.empty());
		
		System.out.println("\nRunning DetectFaceDemo");

	    // Create a face detector from the cascade file in the resources
	    // directory.
	    CascadeClassifier faceDetector = new CascadeClassifier("data/lbpcascades/lbpcascade_frontalface.xml");
		
		Mat image=Highgui.imread("data/14726436.jpg",Highgui.CV_LOAD_IMAGE_COLOR);
		//new LoadImage("lena.jpg",image);
		MatOfRect faceDetections = new MatOfRect();
	    faceDetector.detectMultiScale(image, faceDetections);

	    System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));

	    // Draw a bounding box around each face.
	    for (Rect rect : faceDetections.toArray()) {
	        Core.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
	    }

	    // Save the visualized detection.
	    String filename = "bin/faceDetection.png";
	    System.out.println(String.format("Writing %s", filename));
	    Highgui.imwrite(filename, image);
	    
	    
	}

}
