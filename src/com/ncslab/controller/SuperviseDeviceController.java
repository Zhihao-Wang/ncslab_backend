package com.ncslab.controller;

import com.alibaba.fastjson.JSONObject;
import com.ncslab.pojo.SuperviseDevice;
import com.ncslab.service.SuperviseDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("")
public class SuperviseDeviceController {

    @Autowired
    SuperviseDeviceService superviseDeviceService;

    @RequestMapping(value = "api/supervisedevice",method = RequestMethod.GET)
    public void listSupervicedevice(HttpServletResponse response) throws IOException {
        List<SuperviseDevice> sd = superviseDeviceService.list();
        int retcode=1;
        JSONObject json = new JSONObject();
        json.put("retcode",JSONObject.toJSON(retcode));
        json.put("data", JSONObject.toJSON(sd));
        response.setContentType("application/xml;utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        System.out.println(json);
        out.print(json);
        out.close();

    }

}
