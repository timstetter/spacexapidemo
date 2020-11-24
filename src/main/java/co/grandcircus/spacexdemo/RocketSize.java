package co.grandcircus.spacexdemo;

public class RocketSize {

	private Double meters;
	private Double feet;
	
	
	public Double getMeters() {
		return meters;
	}
	public void setMeters(Double meters) {
		this.meters = meters;
	}
	public Double getFeet() {
		return feet;
	}
	public void setFeet(Double feet) {
		this.feet = feet;
	}
	@Override
	public String toString() {
		return "RocketSize [meters=" + meters + ", feet=" + feet + "]";
	}
	
	
	
}
