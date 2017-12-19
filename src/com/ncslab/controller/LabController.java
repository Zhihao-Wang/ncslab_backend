package com.ncslab.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.ncslab.pojo.Lab;
import com.ncslab.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class LabController {
    @Autowired
    LabService labService;

    @RequestMapping(value = "api/labs",method = RequestMethod.GET)
    public void listLab(HttpServletResponse response) throws IOException {
        List<Lab> labs = labService.list();
        int retcode=1;
        JSONObject json = new JSONObject();
        json.put("retcode",JSONObject.toJSON(retcode));
        json.put("data", JSONObject.toJSON(labs));
        response.setContentType("application/xml;utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        System.out.println(json);
        out.print(json);
        out.close();
    }

    @RequestMapping(value = "api/labs/{id}",method =RequestMethod.GET )
    public void listLab_one(@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
        int retcode;
        Lab lab= labService.get(id);
        if(lab==null){
            retcode=0;
        }
        else{
            retcode=1;
        }
        JSONObject json=new JSONObject();
        json.put("retcode",JSONObject.toJSON(retcode));
        json.put("data", JSONObject.toJSON(lab));
        response.setContentType("application/xml;utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        out.print(json);
        out.close();
    }

    @ResponseBody
    @RequestMapping(value ="api/labs",method = RequestMethod.POST, consumes = "application/json")
    public void addLab(@RequestBody Lab lab, HttpServletResponse response) throws IOException {
        labService.add(lab);
        int retcode=1;
        JSONObject json = new JSONObject();
        json.put("retcode",JSONObject.toJSON(retcode));
        PrintWriter out = response.getWriter();
        out.print(json);
        out.close();
    }

    @ResponseBody
    @RequestMapping(value = "api/labs/{id}",method = RequestMethod.DELETE)
    public void deleteLab(@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
        Lab c= labService.get(id);
        labService.delete(c);
        int retcode=1;
        JSONObject json = new JSONObject();
        json.put("retcode",JSONObject.toJSON(retcode));
        PrintWriter out = response.getWriter();
        out.print(json);
        out.close();
    }


    @RequestMapping(value = "api/labs/{id}",method = RequestMethod.PUT, consumes = "application/json")
    @ResponseBody
    public void updateLab(@RequestBody Lab lab,@PathVariable("id")Integer id, HttpServletResponse response) throws IOException {
        lab.setId(id);
        labService.update(lab);
        int retcode=1;
        JSONObject json = new JSONObject();
        json.put("retcode",JSONObject.toJSON(retcode));
        PrintWriter out = response.getWriter();
        out.print(json);
        out.close();
    }

}
