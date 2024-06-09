package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("name","Mohit");
		System.out.println("adding data to model");
	}
	@RequestMapping("/contact")
	public String contact(Model m) {
		return "contact";
	}
	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,BindingResult bindingResult,Model model) {
		
		System.out.println(user);
		this.userService.createUser(user);
		
//		model.addAttribute("user",user);
		
		return "success";
//	public String handleForm(@RequestParam("email")String email,@RequestParam("userName")String name,@RequestParam("password")String pass, Model model) {
//	User user = new User();
//	user.setEmail(email);
//	user.setPassword(pass);
//	user.setUserName(name);
//	System.out.println(email);
//	System.out.println(name);
//	System.out.println(pass);
//	
//	model.addAttribute("user",user);
//	
//	return "success";
//	public String handleForm(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		System.out.println(email);
//		return "";
	}
}
