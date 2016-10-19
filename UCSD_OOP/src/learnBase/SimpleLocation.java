package learnBase;

public class SimpleLocation {
	private double latitude;
	private double longitude;
	
	public SimpleLocation(){
		this.latitude = 32.9;
		this.longitude = -112.7;
	}
	
	public SimpleLocation(double lat,double lon){
		this.latitude = lat;
		this.longitude = lon;
	}
	
	public double getLatitude(){
		return this.latitude;
	}
	
	public double getLongitude(){
		return this.longitude;
	}
	
	public void setLatitude(double lat){
		if( lat<-180 || lat>180){
			System.out.println("Illegal value for latitude");
		}else{
			this.latitude=lat;
		}
	}
	
	public void setLongitude(double lon){
		if( lon<-180 || lon>180){
			System.out.println("Illegal value for longitude");
		}else{
			this.longitude=lon;
		}
	}
	
	public double distance(SimpleLocation other){
		return Math.sqrt(Math.pow(this.latitude-other.latitude,2)+Math.pow(this.longitude-other.longitude, 2));
		//return getDist(this.latitude,this.longitude,other.latitude,other.longitude);
	}
	
	public double distance(double otherLat,double otherLon){
		return Math.sqrt(Math.pow(this.latitude-otherLat,2)+Math.pow(this.longitude-otherLon, 2));
		//return getDist(this.latitude,this.longitude,other.latitude,other.longitude);
	}
}
