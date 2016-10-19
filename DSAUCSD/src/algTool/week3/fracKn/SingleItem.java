package algTool.week3.fracKn;

public class SingleItem {	
	public int value;
	public int weight;
	public double valueItem;
	
	public SingleItem(int val,int wt){
		this.value = val;
		this.weight = wt;
		this.valueItem = (double)this.value/(double)this.weight;
	}
	
	public double getValueItem(){
		return (double)this.value/(double)this.weight;
	}
	
}
