package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

	@Autowired
	private ServerDetails serverDetails;
	
	@GetMapping("/display")
	public ServerDetails displayData() {
		
		return new ServerDetails(serverDetails.getMin(), serverDetails.getMax());
	}
}
