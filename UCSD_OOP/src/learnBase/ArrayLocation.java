package learnBase;

public class ArrayLocation {
	private double[] coords;
	
	public ArrayLocation(double[] coords){
		this.setCoords(coords);
	}

	public double[] getCoords() {
		return coords;
	}

	public void setCoords(double[] coords) {
		this.coords = coords;
	}
}
