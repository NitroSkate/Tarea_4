package com.tarea4.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tarea4.tarea4.domain.Product;

@Controller
public class ProductController {

	@RequestMapping("/product")
	public ModelAndView product() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", new Product());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/validar")
	public ModelAndView validar(@Valid @ModelAttribute Product producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}
		else {
			mav.addObject("producto", producto.getNombrep());
			mav.setViewName("resultado");
		}
		return mav;
	}
	
	
}
