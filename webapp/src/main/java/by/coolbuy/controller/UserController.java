package by.coolbuy.controller;
//from controllers


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




import by.coolbuy.model.User;
import by.coolbuy.service.UserService;

/**
 * Контроллер для главной страницы приложения.
 */
@Controller
public class UserController {
	
	@Autowired private UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
    public String userRegisterPage(Model model) {
            model.addAttribute("user", new User());
            return "/regpage";
    }
	
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public String userRegister(@ModelAttribute User user, Model model)
	{
		
		userService.createUser(user);
        
        String message = "User was successfully created.";
        model.addAttribute("message", message);
        
        return "/welcome";
	}


}