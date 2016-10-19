package printing;

abstract public class Machine{
	protected boolean isOn;
	
	public Machine(){
	}
	
	public Machine(boolean isOn){
		this.isOn=isOn;
	}
	
	public void turnOn(){
		isOn=true;
		System.out.println("Machine is On!");
	}
	
	public void turnOff(){
		isOn=false;
	}

	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.isOn;
	}

	abstract public void print(int copies);
}
