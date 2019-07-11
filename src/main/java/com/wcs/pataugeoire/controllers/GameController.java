package com.wcs.pataugeoire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GameController{

    @GetMapping("/game")
    public String game(Model model) {
        int[][] boats1 = {
            {2, 1},
            {2, 2},
            {2, 3}
        };
        int[][] boats2 = {
            {6, 1}
        };
        int[][] boats3 = {
            {2, 6},
            {3, 6},
            {4, 6}
        };
        int[][] boats4 = {
            {5, 3},
            {5, 4}
        };
        int[][] boats5 = {
            {3, 6},
            {4, 6},
            {5, 6}
        };
        int[][] boats6 = {
            {6, 1}
        };
        int[][] boats7 = {
            {2, 2},
            {3, 2}
        };
        int[][] boats8 = {
            {1, 6},
            {1, 5},
            {1, 4}
        };
        model.addAttribute("boats1", boats1);
        model.addAttribute("boats2", boats2);
        model.addAttribute("boats3", boats3);
        model.addAttribute("boats4", boats4);
        model.addAttribute("boats5", boats5);
        model.addAttribute("boats6", boats6);
        model.addAttribute("boats7", boats7);
        model.addAttribute("boats8", boats8);
        return "game";
    }

    }
