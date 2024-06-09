package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class recontroller {
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("One");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("./two");
		return redirectView;
//		return "redirect:/two";
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("two");
		return "contact";
	}
}
