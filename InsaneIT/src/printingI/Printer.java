package printingI;

import printing.PaperTray;

public class Printer<T> implements IMachine{
	//private boolean isOn;
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	private T cartridge;
			
	public Printer(){
		this.machine=new Machine();
	}
		
	public Printer(boolean isOn,String modelNumber) {
		this.machine=new Machine(isOn);
		this.modelNumber = modelNumber;
	}
	
	public Printer(boolean isOn,String modelNumber, T cartridge) {
		this.machine=new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}
		
	public Printer(boolean isOn,String modelNumber,PaperTray paperTray){
		this.machine=new Machine(isOn);
		this.modelNumber = modelNumber;
		this.paperTray = paperTray;
	}
	
	public void setCartridge(T cartridge){
		this.cartridge = cartridge;
	}

	public void loadPaper(int count){
		this.paperTray.addPaper(count);
	}
	
	public<U> void printUsingCart(U cartridge, String message){
		System.out.println(cartridge.toString()+" "+message);
	}
		
	public void print(int copies){
		String onStatus="";
		if(isOn()){
			onStatus = " is On!";
		}else{
			onStatus = " is Off!";
		}
		String textToPrint = modelNumber + onStatus;
		while(copies>0 && !paperTray.isEmpty()){
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}
		if(paperTray.isEmpty()){
			System.out.println("Load more papers!");
		}
			
	}
		
	public void print(String text){
		String textPre = this.cartridge.toString();
		System.out.println(textPre+" : "+text);
	}
		
	public String getModelNumber(){
		return this.modelNumber;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Warming up printer.");
		this.machine.turnOn();
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		this.machine.turnOff();
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.machine.isOn();
	}
}
