package com.wcs.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EndController{

    @GetMapping("/end")
    public String getEnd(Model model){
        return null;
    }
}