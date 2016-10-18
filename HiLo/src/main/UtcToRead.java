package main;

public class UtcToRead {
	
	public String utcToReadable(long in){
		
		int s = (int)(in/1000)%60;
		int m = (int)(in/1000/60)%60;
		int h = (int)(in/1000/60/60);
		String timmar = "";
		String minuter = "";
		String sekunder = "";
		String out = "";
		
		if(h == 1){
			timmar = "timme";
		}
		else{
			timmar = "timmar";
		}
		if(m == 1){
			minuter = "minut";
		}
		else{
			minuter = "minuter";
		}
		if(s == 1){
			sekunder = "sekund";
		}
		else{
			sekunder = "sekunder";
		}
		if(h!=0){
			out += h + " " + timmar;
			if(m == 0 ^ s == 0){
				out += " och ";
			}
			else if(m != 0 && s != 0){
				out += ", ";
			}
		}
		if(m != 0){
			out += m + " " + minuter;
			if(s != 0){
				out += " och ";
			}
		}
		if(s!=0){
			out += s + " " + sekunder;
		}
		
		return out;
	}
}
