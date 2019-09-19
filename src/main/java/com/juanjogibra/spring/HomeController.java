package com.juanjogibra.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("irHola")
	public ModelAndView redireccion() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hola");
		return mv;
		
	}
	
}
