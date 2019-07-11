package com.wcs.pataugeoire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GameController{

    @GetMapping("/game")
    public String game(Model model) {
        int[][] boats = {
            {2, 3},
            {3, 4}
        };
        model.addAttribute("boats", boats);
        return "game";
    }

    }
