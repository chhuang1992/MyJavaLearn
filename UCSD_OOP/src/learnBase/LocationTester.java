package learnBase;

public class LocationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLocation ucsd = new SimpleLocation(32.9,-117.2);
		SimpleLocation lima = new SimpleLocation(-12.0,-77.0);
		
		System.out.println(ucsd.distance(lima));
		
		double[] coords = {5.0,0.0};
		ArrayLocation accra = new ArrayLocation(coords);
		coords[0] = 32.9;
		coords[1] = -117.2;
		System.out.println(accra.getCoords()[0]);
	}

}
