package com.how2java.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.how2java.pojo.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public void listCamera(HttpServletResponse response) throws IOException {
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
	public void listCamera_one(@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
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

	@ResponseBody
	@RequestMapping(value ="api/cameras",method = RequestMethod.POST, consumes = "application/json")
	public void addCamera(@RequestBody Camera camera, HttpServletResponse response) throws IOException {
//		response.setHeader("Access-Control-Allow-Methods","POST");
		cameraService.add(camera);
		int retcode=1;
		JSONObject json = new JSONObject();
		json.put("retcode",JSONObject.toJSON(retcode));
		PrintWriter out = response.getWriter();
		out.print(json);
		out.close();
	}

	@ResponseBody
	@RequestMapping(value = "api/cameras/{id}",method = RequestMethod.DELETE)
	public void deleteCamera(@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
		Camera c= cameraService.get(id);
		cameraService.delete(c);
		int retcode=1;
		JSONObject json = new JSONObject();
		json.put("retcode",JSONObject.toJSON(retcode));
		PrintWriter out = response.getWriter();
		out.print(json);
		out.close();
	}


	@RequestMapping(value = "api/cameras/{id}",method = RequestMethod.PUT, consumes = "application/json")
	@ResponseBody
	public void updateCamera(@RequestBody Camera camera,@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
		camera.setId(id);
		cameraService.update(camera);
		int retcode=1;
		JSONObject json = new JSONObject();
		json.put("retcode",JSONObject.toJSON(retcode));
		PrintWriter out = response.getWriter();
		out.print(json);
		out.close();
	}

}
