package com.wcs.pataugeoire.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EndController{

    @GetMapping("/end")
    public String getEnd(Model model, HttpSession session){
        int attackCount = (Integer)session.getAttribute("attackCount");
        model.addAttribute("attackCount", attackCount);

        session.setAttribute("attackCount", 0);
        
        return "end";
    }
}