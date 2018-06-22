package com.izziloop.thereadingtroll.thereadingtroll;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ApplicationController {

    @Value("${application.title}")
    private String applicationTitle;

    @RequestMapping("/")
    public String start(Map<String, Object> model) {
        model.put("title", this.applicationTitle);
        return "start";
    }

}
