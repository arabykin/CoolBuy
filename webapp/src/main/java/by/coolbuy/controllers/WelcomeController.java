package by.coolbuy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
/**
 * Контроллер для главной страницы приложения.
 */
@Controller
public class WelcomeController {
 
 private int visitorCount = 0;
 
 @RequestMapping("/welcome.html")
 public String index(Model model) {
    model.addAttribute("visitorCount", visitorCount++);
    return "welcome";
 }
/* 
 @RequestMapping(value = "/index", method = RequestMethod.GET)
 public String index(@ModelAttribute("model") ModelMap model) {*/
 
}