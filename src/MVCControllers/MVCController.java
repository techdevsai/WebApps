package MVCControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MVCController {
	
	@RequestMapping(value="/homefirst",method=RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("store.jsp");
		
	}
	
	@RequestMapping(value="/pros",method=RequestMethod.GET)
	public ModelAndView product() {
		return new ModelAndView("products");
		
	}
	   @RequestMapping("/home")
	    public String greeting() {
		   
	        //model.addAttribute("name", name);
	        return "redirect:/index.html";
	    }


}
