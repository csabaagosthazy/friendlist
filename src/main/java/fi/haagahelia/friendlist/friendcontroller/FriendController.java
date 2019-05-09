package fi.haagahelia.friendlist.friendcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.friendlist.service.FriendService;


@Controller
public class FriendController {
	
	
	@RequestMapping("/index")
	public String student(Model model) {
		model.addAttribute("friends", FriendService.getFriend());
		
		
		return "index";
	}
	
	@PostMapping("/index")
	public String addFriend(@ModelAttribute String name, Model model) {
		model.addAttribute("name", name);
		FriendService.nameToFriend(name);
		
		return "redirect.../index";
	}
	


}
