package printingI;

public class PaperTray {
	private int pages=0;

	public PaperTray(){
		
	}
	public PaperTray(int pages){
		this.pages = pages;
	}
	
		
	public void addPaper(int count){
		this.pages += count;
	}
	
	public void usePage(){
		this.pages--;
	}
	
	public void usePages(int count){
		this.pages-=count;
	}
	
	public boolean isEmpty(){
		return this.pages<=0;
	}
}
