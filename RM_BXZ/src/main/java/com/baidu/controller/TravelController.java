package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TravelController  {

    @RequestMapping(value = "/travell", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
          model.addAttribute("message", "Hello Spring MVC Framework!");
          return "success";
       }

    //Here I want to save the data to database also

}