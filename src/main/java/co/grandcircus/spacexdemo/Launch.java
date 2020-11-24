package co.grandcircus.spacexdemo;

public class Launch {

	private String static_fire_date_utc;
	private boolean success;
	private String details;
	private String name;
	private String id;
	private String rocket;
	
	
	public String getStatic_fire_date_utc() {
		return static_fire_date_utc;
	}
	public void setStatic_fire_date_utc(String static_fire_date_utc) {
		this.static_fire_date_utc = static_fire_date_utc;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRocket() {
		return rocket;
	}
	public void setRocket(String rocket) {
		this.rocket = rocket;
	}
	@Override
	public String toString() {
		return "Launch [static_fire_date_utc=" + static_fire_date_utc + ", success=" + success + ", details=" + details
				+ ", name=" + name + ", id=" + id + ", rocket=" + rocket + "]";
	}
	
	
	
}
