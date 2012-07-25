package fr.Pasificking.SeasonManager;

public class Season {

	private String name = new String();
	private int duration;
	
	Season(String name,int duration){
		this.setName(name);
		this.setDuration(duration);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
