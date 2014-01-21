package by.coolbuy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import by.coolbuy.models.User;

/**
 * Контроллер для главной страницы приложения.
 */
@Controller
public class UserController {

	@RequestMapping(value="user/register", method= RequestMethod.POST)
	public String userRegister(String name, String email, String password, BindingResult br,  Model ui)
	{
		System.out.println(br.toString());
		//System.out.println(u.toString());
			
		//ui.addAttribute("user", u);
			
		return "user/list";
	}


}