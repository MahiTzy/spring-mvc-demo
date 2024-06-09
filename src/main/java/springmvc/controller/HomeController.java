package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is Home");
		model.addAttribute("name","Mohit Singh");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About");
		return "about";
	}
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is Services");
		return "services";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help");
		ModelAndView modelAndView = new ModelAndView();
		List<Integer> marks = new ArrayList<>();
		marks.add(123);
		marks.add(123);
		marks.add(123);
		marks.add(123);
		marks.add(123);
		modelAndView.addObject("name", marks);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
