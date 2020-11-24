package co.grandcircus.spacexdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LaunchService {

	private RestTemplate rt = new RestTemplate();
	
	public Launch getLatestLaunch() {
		String url = "https://api.spacexdata.com/v4/launches/latest";
		return rt.getForObject(url, Launch.class);
		
	}
	
	public Launch[] getLaunches() {
		String url = "https://api.spacexdata.com/v4/launches";
		return rt.getForObject(url, Launch[].class);
	}
	
	public Launch getLaunchById(String id) {
		String url = "https://api.spacexdata.com/v4/launches/" + id;
		return rt.getForObject(url, Launch.class);
	}
	
	public Rocket getRocketById(String id) {
		String url = "https://api.spacexdata.com/v4/rockets/" + id;
		return rt.getForObject(url, Rocket.class);
	}
}
