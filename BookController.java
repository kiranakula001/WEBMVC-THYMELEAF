package spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import spring.thymeleaf.entity.Book;

@Controller
public class BookController {

	@GetMapping("/")
	public String displayForm(Model model) {
		Book b1 = new Book();
		model.addAttribute("books",b1);
		return "index";
	}
	
	@PostMapping("/register")
	public String saveData( Book book ,Model model )
	{
		model.addAttribute("msg","Form Submitted Successfullyy!!!");
		return "feedback";
	}
}