package by.coolbuy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.coolbuy.dao.UserDAO;
import by.coolbuy.models.User;

/**
 * Контроллер для главной страницы приложения.
 */
@Controller
public class UserController {
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String index(Model ui)
	{
		ui.addAttribute("user", new User());

		return "index";
	}

	@RequestMapping(value="/user/register", method= RequestMethod.POST)
	public String userRegister(@ModelAttribute("user") User u, BindingResult br,  Model ui)
	{
		System.out.println(br.toString());
		System.out.println(u.toString());
		UserDAO userDao = new UserDAO();
		userDao.add(u);
			
		ui.addAttribute("user", u);
			
		return "welcome";
	}


}