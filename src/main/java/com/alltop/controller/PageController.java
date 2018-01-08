package com.alltop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alltop.model.Picture;

@Controller
public class PageController {

	@RequestMapping("/")
	     public String indexPage() {
	         return "index";
	     }
	
	@RequestMapping("/addPicture")
    public String picturePage(Model model) {
        model.addAttribute("picture", new Picture());
        return "addPicture";
    }
	
	@PostMapping("/confirmAddPicture")
    public String picturePage(@ModelAttribute("picture") Picture picture) {
        return "confirmAddPicture";
    }
}
