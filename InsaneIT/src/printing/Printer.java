package printing;

public class Printer extends Machine{
	
	//private boolean isOn;
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	//private Machine machine;
		
	public Printer(){
	}
	
	public Printer(boolean isOn,String modelNumber) {
		super(isOn);
		this.modelNumber = modelNumber;
	}
	
	public Printer(boolean isOn,String modelNumber,PaperTray paperTray){
		super(isOn);
		this.modelNumber = modelNumber;
		this.paperTray = paperTray;
	}

	public void loadPaper(int count){
		this.paperTray.addPaper(count);
	}
	
	@Override
	public void print(int copies){
		String onStatus="";
		if(isOn){
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
		System.out.println(text);
	}
	
	public String getModelNumber(){
		return this.modelNumber;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Warming up printer.");
		super.isOn=true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		super.turnOff();
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return super.isOn;
	}
	
	
}
