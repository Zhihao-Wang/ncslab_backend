package com.how2java.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.how2java.pojo.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.how2java.service.CameraService;


import javax.servlet.http.HttpServletResponse;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CameraController {
	@Autowired
	CameraService cameraService;

	@RequestMapping(value = "api/cameras",method = RequestMethod.GET)
	public void listCategory(HttpServletResponse response) throws IOException {

		List<Camera> cs = cameraService.list();
		int retcode=1;

		JSONObject json = new JSONObject();
		json.put("retcode",JSONObject.toJSON(retcode));
		json.put("data", JSONObject.toJSON(cs));
		response.setContentType("application/xml;utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		System.out.println(json);
		out.print(json);
		out.close();

	}

	@RequestMapping(value = "api/cameras/{id}",method =RequestMethod.GET )
	public void listCategory_one(@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
		int retcode;
		Camera c= cameraService.get(id);
		if(c==null){
			retcode=0;
		}
		else{
			retcode=1;
		}
		JSONObject json=new JSONObject();
		json.put("retcode",JSONObject.toJSON(retcode));
		json.put("data", JSONObject.toJSON(c));
		response.setContentType("application/xml;utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.print(json);
		out.close();

	}
	@RequestMapping(value ="api/cameras",method = RequestMethod.POST)
	public void addCamera(@RequestBody(required = true)Camera camera){
		cameraService.add(camera);
	}

	@RequestMapping(value = "api/cameras/{id}",method = RequestMethod.DELETE)
	public void deleteCategory(@PathVariable("id")Integer id) {
		Camera c= cameraService.get(id);
		cameraService.delete(c);
	}


	@RequestMapping(value = "api/cameras/{id}",method = RequestMethod.POST)
	public void editCategory(@RequestBody(required=true)Camera camera) {
		cameraService.update(camera);

	}

}
