package MVCControllers;

import org.apache.http.HttpRequest;
import org.apache.http.client.HttpResponseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class MVCController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage() {
		return "store";
		
	}
	
	@RequestMapping(value="/pros",method=RequestMethod.GET)
	public String product() {
		return "products";
		
	}

}
