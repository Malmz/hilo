package main;

public class Main{
	
	//Main metoden där allt körs
	public static void main(String[] args) {
		
		//Variabler
		int snr = 0;
		int tgnr = 0;
		long ttime = 0;
		
		//Game loop
		while(true){
			
			//Kör menyn och få tillbaka svårighetsgraden
			int m = new Menu().menu();
			
			if(m > 0){
				
				//Skapa nytt spel och kör spelet
				Game gobj = new Game();
				gobj.game(m);
				
				tgnr += gobj.getGnr();
				ttime += gobj.getTime();
				snr++;
			}
			else if(m == -2){
				if(snr>0){
					System.out.println("Du gissade i genomsnitt " + (tgnr/snr) + " gånger.\n" 
					+ "Det tog i genomsnitt " + new UtcToRead().utcToReadable(ttime/snr) + ".\n");
				}
				break;
			}
		}
	}
}
