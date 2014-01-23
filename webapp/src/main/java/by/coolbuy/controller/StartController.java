package by.coolbuy.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {
	
	protected static Logger logger = Logger.getLogger(StartController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String mainPage(Model model) {
		logger.debug("Call / ");
            return "/index";
    }
    
	@RequestMapping(value="/index", method=RequestMethod.GET)
    public String indexPage(Model model) {
		logger.debug("Call /index");
            return "/index";
    }

}
