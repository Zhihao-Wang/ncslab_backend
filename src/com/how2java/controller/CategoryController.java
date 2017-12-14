package com.how2java.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

import javax.servlet.http.HttpServletResponse;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public void listCategory( HttpServletResponse response) throws IOException {
//		ModelAndView mav = new ModelAndView();
		List<Category> cs = categoryService.list();
//		int total = categoryService.total();
//		page.caculateLast(total);
//		 放入转发参数
//		mav.addObject("cameralist", cs);
		JSONObject json = new JSONObject();
		json.put("cameraList", JSONObject.toJSON(cs));
		PrintWriter out = response.getWriter();
		out.print(json);
		out.close();
//		// 放入jsp路径
//		mav.setViewName("listCategory");
//		return mav;
	}

	@RequestMapping("listCategory/{id}")
	public void listCategory_one(@PathVariable("id")Integer id, Category category, HttpServletResponse response) throws IOException {
		Category c= categoryService.get(id);
//		ModelAndView mav = new ModelAndView();
//		 放入转发参数
//		mav.addObject("c", c);
		JSONObject json=new JSONObject();
		json.put("cameraFormData", JSONObject.toJSON(c));
		PrintWriter out=response.getWriter();
		out.print(json);
		out.close();
//		// 放入jsp路径
//		mav.setViewName("listCategory");
//		return mav;
	}
	
	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category){
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
	    return mav;
	}	
	@RequestMapping("deleteCategory")
	public ModelAndView deleteCategory(Category category){
		categoryService.delete(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}	
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category){
		Category c= categoryService.get(category.getId());
		ModelAndView mav = new ModelAndView("editCategory");
		mav.addObject("c", c);
		return mav;
	}	
	@RequestMapping("updateCategory")
	public ModelAndView updateCategory(Category category){
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}	

}
