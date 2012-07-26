package fr.Pasificking.SeasonManager;

public class Season {

	private String name = new String();
	private long duration;
	
	Season(String name,long duration){
		this.setName(name);
		this.setDuration(duration);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	
}
