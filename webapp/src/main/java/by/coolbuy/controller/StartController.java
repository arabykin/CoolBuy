package by.coolbuy.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {
	
	protected static Logger logger = Logger.getLogger(StartController.class);
	
	@RequestMapping(value="/")
    public String mainPage() {
		logger.debug("Call / ");
            return "/index";
    }
    
	@RequestMapping(value="/index")
    public String indexPage() {
		logger.debug("Call /index");
            return "/index";
    }

}