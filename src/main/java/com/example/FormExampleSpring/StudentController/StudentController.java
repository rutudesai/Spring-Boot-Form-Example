package com.example.FormExampleSpring.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.FormExampleSpring.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/index")
	public String GetForm(Model model) {
		model.addAttribute("Student",new Student());
		return "index";
	}
	@PostMapping("/registration")
	public String PostForm(@ModelAttribute Student student,BindingResult result, Model model) {
		model.addAttribute("Student",student);
		return "registration";
	}
	
}
