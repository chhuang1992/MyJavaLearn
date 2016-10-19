package usingOpenCV;

import java.util.ArrayList;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
//import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class testMat {
	
	public static double getOrientation(MatOfPoint pts_, Mat img){
		Point[] pts = pts_.toArray();
		int sz = pts.length;
		Mat data_pts =new Mat(sz, 2, CvType.CV_64FC1);
		
		double[] sum = {0.0,0.0};
		
		for (int i = 0; i < data_pts.rows(); ++i){
			data_pts.put(i, 0, pts[i].x);
			data_pts.put(i, 1, pts[i].y);
			sum[0] += pts[i].x;
			sum[1] += pts[i].y;
		}
		//System.out.println(data_pts.dump());
		
		Point cntr = new Point(sum[0]/data_pts.rows(),sum[1]/data_pts.rows());
		System.out.println(cntr.x);	
		System.out.println(cntr.y);	
		Mat mean = new Mat();
		//Scalar mean = Core.mean(data_pts);
		//System.out.println(mean);
		//Mat eigenvalues = new Mat();
		Mat eigenvectors = new Mat();
		//Mat result = new Mat();
		//Core.eigen(data_pts, true, eigenvalues, eigenvectors);
		Core.PCACompute(data_pts, mean, eigenvectors);
		//System.out.println(mean.dump());
		//System.out.println(eigenvectors.dump());
		
		//Mat result = new Mat();
		//Core.PCAProject(data_pts, mean, eigenvectors, result );
		//System.out.println(mean.dump());
		System.out.println(eigenvectors.dump());
		//System.out.println(result.dump());
		System.out.println(eigenvectors.get(0,1)[0]);
		Mat eigenvalues = new Mat();
		Mat vectors = new Mat();
		Core.eigen(eigenvectors, false, eigenvalues, vectors);
		System.out.println(eigenvalues.dump());
		return 0.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		Mat data_pts =new Mat(12, 2, CvType.CV_64FC1);
		
		for (int i = 0; i < data_pts.rows(); ++i){
			data_pts.put(i, 0, i);
			data_pts.put(i, 1, i*2);
		}
		//System.out.println(data_pts.dump());
		//Scalar mean = Core.mean(data_pts);
		//System.out.println(mean);
		
		Mat src = Highgui.imread("data/pca_test1.jpg");
		
		// Convert image to grayscale
		Mat gray = new Mat();
	    Imgproc.cvtColor(src, gray, Imgproc.COLOR_BGR2GRAY);
		
	    // Convert image to binary
	    Mat bw = new Mat();
	    Imgproc.threshold(gray, bw, 50, 255, Imgproc.THRESH_BINARY | Imgproc.THRESH_OTSU);
	    
	    Mat hierarchy = new Mat();
	    ArrayList<MatOfPoint> contours = new ArrayList<MatOfPoint> ();
	    System.out.println(contours.size());
	    Imgproc.findContours(bw, contours, hierarchy, Imgproc.RETR_LIST, Imgproc.CHAIN_APPROX_NONE);
	    System.out.println(contours.size());
	    
	    getOrientation(contours.get(0), src);
	    
	    Mat testMat = new Mat(2,2,CvType.CV_64FC1);
	    testMat.put(0,0,3);
	    testMat.put(0,1,4);
	    testMat.put(1,0,5);
	    testMat.put(1,1,8);
	    Mat testeigenvalues = new Mat();
		Mat testeigenvectors = new Mat();
		
		Mat mean = new Mat();
		Mat eigenvectorsP = new Mat();
		Core.PCACompute(testMat, mean, eigenvectorsP);
		System.out.println(mean.dump());
		System.out.println(eigenvectorsP.dump());
		Core.eigen(eigenvectorsP, true, testeigenvalues, testeigenvectors);
		System.out.println(testeigenvalues.dump());
		System.out.println(testeigenvectors.dump());
		
		Core.eigen(testMat, true, testeigenvalues, testeigenvectors);
		System.out.println(testeigenvalues.dump());
		System.out.println(testeigenvectors.dump());
		
		Mat testeigenvalues2 = new Mat();
		Mat testeigenvectors2 = new Mat();
		Core.eigen(testeigenvectors, true, testeigenvalues2, testeigenvectors2);
		System.out.println(testeigenvalues.dump());
		System.out.println(testeigenvectors.dump());
	    
	}

}
