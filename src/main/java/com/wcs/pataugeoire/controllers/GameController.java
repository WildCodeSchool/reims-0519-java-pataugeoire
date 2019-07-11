package com.wcs.pataugeoire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GameController{

    @GetMapping("/game")
    public String game(Model model) {
        int[][] boats1 = {
            {2, 3},
            {3, 4},
            {2, 5},
            {5, 6}
        };
        int[][] boats2 = {
            {5, 5},
            {4, 2},
            {6, 3},
            {1, 1}
        };
        model.addAttribute("boats1", boats1);
        model.addAttribute("boats2", boats2);
        return "game";
    }

    }
