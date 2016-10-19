package insaneITtest;

import printingI.BWCartridge;
import printingI.ColorCartridge;
//import printingI.PaperTray;
//import printingI.IMachine;
import printingI.Printer;

public class PrintingItest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PaperTray paperTray=new PaperTray(5);
		//Printer printer = new Printer(true,"My Printer Lenovo",paperTray);
		/*Printer printer = new Printer(true,"My PRINTER Lenovo" ,paperTray);
		//printer.loadPaper(5);
		printer.print(2);
		printer.turnOff();
		printer.print(2);
		printer.turnOn();
		printer.print(2);
		Integer cartridge = new Integer(5);
		printer.setCartridge(cartridge);
		printer.print("hello");
		printer.printUsingCart(new ColorCartridge(), "hi");
		printer.printUsingCart(new ColorCartridge(), "hi");*/
		
		Printer<Integer> printer2 = new Printer<Integer>(true,"My PRINTER Lenovo");
		printer2.loadPaper(5);
		printer2.print(2);
		printer2.turnOff();
		printer2.print(2);
		printer2.turnOn();
		printer2.print(2);
		Integer cartridge = new Integer(5);
		printer2.setCartridge(cartridge);
		printer2.print("hello");
		printer2.printUsingCart(new ColorCartridge(), "hi");
		
		Printer<BWCartridge> printer3 = new Printer<BWCartridge>(true,"My PRINTER Lenovo",new BWCartridge());
		printer3.loadPaper(5);
		printer3.print(2);
		printer3.turnOff();
		printer3.print(2);
		printer3.turnOn();
		printer3.print(2);
		BWCartridge cartridge2 = new BWCartridge();
		printer3.setCartridge(cartridge2);
		printer3.print("hello");
		printer3.printUsingCart(new ColorCartridge(), "hi");
	}

}
