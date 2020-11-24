package co.grandcircus.spacexdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

	@Autowired
	private LaunchService launchService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("launches", launchService.getLaunches());
		return "index";
	}
	
	@GetMapping("/latest")
	public String latest(Model model) {
		model.addAttribute("launch", launchService.getLatestLaunch());
		return "latest";
	}
	
	@GetMapping("/launch/{id}")
	public String launch(@PathVariable String id, Model model) {
		model.addAttribute("launch", launchService.getLaunchById(id));
		return "launch";
	}
	
	@GetMapping("/rocket/{id}")
	public String rocket(@PathVariable String id, Model model) {
		model.addAttribute("rocket", launchService.getRocketById(id));
		return "rocket";
	}
	
	
}
