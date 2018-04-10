package com.spring.sample;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;
	 
	@Controller
	public class HelloWorldSample {
		String message = "Welcome to Spring MVC!";
	 
		@RequestMapping("/hello")
		public ModelAndView showMessage(
				@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
			System.out.println("in controller");
	 
			ModelAndView mv = new ModelAndView("helloworld");
			mv.addObject("message", message);
			mv.addObject("name", name);
			return mv;
		}
		
		/*@RequestMapping("/")
		public ModelAndView home(
				@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
			System.out.println("home page using internal view resolver in controller");
			ModelAndView mv = new ModelAndView("index");
			mv.addObject("message", message);
			mv.addObject("name", name);
			return mv;
		}*/
		
		@RequestMapping("/")
		public String homeView() {
			System.out.println("home page using index.jsp which is available out side views folder controller");
			return "index";
		}
	}