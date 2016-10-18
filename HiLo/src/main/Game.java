package main;

import java.util.Date;

public class Game {

	private int Xgnr = 0;
	private long Xtime = 0;
	
	private void setGnr(int in){
		Xgnr = in;
	}
	private void setTime(long in){
		Xtime = in;
	}
	public int getGnr(){
		return Xgnr;
	}
	public long getTime(){
		return Xtime;
	}
	
	private int randNum(int dif){
		return (int)(Math.random() * dif + 1);
	}
	
	public void game(int difficulty){
			
			int num = new Game().randNum(difficulty);
			int gnr = 1;
			long stime = new Date().getTime();
			int inNum = Kbd.readInt("Gissa på ett nummer: ");
			while(inNum != num){
				if(inNum < num){
					System.out.println("\n" + inNum + " är för lågt.");
				}
				else if(inNum > num){
					System.out.println("\n" + inNum + " är för högt.");
				}
				else{
					break;
				}
				inNum = Kbd.readInt("Gissa igen:");
				gnr++;
			}
			
			//Post game
			long etime = new Date().getTime();
			
			String gånger = "";
			if(gnr == 1 || gnr == -1){
				gånger = "gång";
			}
			else{
				gånger = "gånger";
			}
			
			System.out.println("\nDu gissa rätt, talet var " + num + ".\n" 
			+ "Du gissade " + gnr + " " + gånger + " och det tog " + new UtcToRead().utcToReadable(etime-stime) + ".\n");
			this.setGnr(gnr);
			this.setTime(etime-stime);
		}
		
}
