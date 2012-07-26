package fr.Pasificking.SeasonManager;

import java.util.ArrayList;

public class SeasonManage {

	private static Season ActuallySeason;
	public static ArrayList<Season> Season = new ArrayList<Season>();
	
	public SeasonManage(Boolean init,int Duration){
		if(!init){
			Season.add(new Season("Primtemps",Duration));
			Season.add(new Season("Eté",Duration));
			Season.add(new Season("Automne",Duration));
			Season.add(new Season("Hiver",Duration));
			setActuallySeason(Season.get(0));
		}
	}
	
	public SeasonManage(Boolean init){
		if(!init){
			Season.add(new Season("Primtemps",20));
			Season.add(new Season("Eté",20));
			Season.add(new Season("Automne",20));
			Season.add(new Season("Hiver",20));
			setActuallySeason(Season.get(0));
		}
	}

	public static Season getActuallySeason() {
		return ActuallySeason;
	}

	public static void setActuallySeason(Season actuallySeason) {
		ActuallySeason = actuallySeason;
	}

	
	
}
