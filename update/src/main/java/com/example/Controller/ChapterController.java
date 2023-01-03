package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DTO.ChapterDto;
import com.example.Service.ChapterService;
@Controller
public class ChapterController {

		@Autowired
		ChapterService chapterService;
		@PostMapping("/update")
		public String registerUser(@ModelAttribute("chapter") ChapterDto chapterDto ) {
			chapterService.update(chapterDto);
			return "redirect:/update";
			
		}
}
