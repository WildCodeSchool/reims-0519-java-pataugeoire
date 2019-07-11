package com.wcs.pataugeoire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GameController{

    @GetMapping("/game")
    public String game(Model model) {
        return "game";
    }

    }
