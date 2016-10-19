package insaneITtest;

//import printing.Machine;
import printing.PaperTray;
import printing.Printer;


public class PrintingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaperTray paperTray=new PaperTray(5);
		Printer printer = new Printer(true,"My Printer Lenovo",paperTray);
		//printer.loadPaper(5);
		printer.print(2);
		printer.turnOff();
		printer.print(2);
		printer.turnOn();
		printer.print(2);
	}

}
