package main;

public class Menu {
	
	public int menu(){
		int in = Kbd.readInt("Välj svårighets grad: \n"
		+ "(1) Lätt 1-10 \n" 
		+ "(2) Medel 1-100 \n" 
		+ "(3) Svår 1-1000 \n" 
		+ "(4) Extrem 1-10000 \n"
		+ "(0) Exit \n");
		
		while(true){
			switch (in) {
			
			case 1:
				return 10;

			case 2:
				return 100;
			
			case 3:
				return 1000;
			
			case 4:
				return 10000;
			
			case 0:
				return -2;
			
			default:
				in = Kbd.readInt(in + " är inte ett alternativ, skriv igen: \n");
				break;
			}
		}
	}
	
}
