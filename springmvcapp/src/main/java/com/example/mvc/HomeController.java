package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        return "hello-world";
    }
    
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String showRedirect() {
        return "redirect:/"; // Redirect to the root URL";
    }

    
//    @RequestMapping(value = "/servicios", method = RequestMethod.GET)
//	public String showHelloPage() {
//		return "servicios";
//	}
    
}