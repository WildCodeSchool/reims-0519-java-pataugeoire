package com.wcs.pataugeoire.controllers;

import java.util.List;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import com.wcs.pataugeoire.entities.Boat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GameController{

    @PostMapping("/game")
    public String attack(@RequestParam int id, HttpSession session) {
        if(session.getAttribute("boats") == null) {
            List<Boat> boats = Arrays.asList(new Boat[]{
                // boat 1
                new Boat(2, 1),
                new Boat(2, 2),
                new Boat(2, 3),
                // boat 2
                new Boat(6, 1),
                // boat 3
                new Boat(2, 6),
                new Boat(3, 6),
                new Boat(4, 6),
                // boat 4
                new Boat(5, 3),
                new Boat(5, 4)
            });
            session.setAttribute("boats", boats);
        }
        int x = 2;
        int y = 2;
        /*for(Boat boat : (List<Boat>)(session.getAttribute("boats"))) {
            System.out.println(boat.getX() + " " + boat.getY() + " " + boat.isDestroyed());
        }*/
        for(Boat boat : (List<Boat>)(session.getAttribute("boats"))) {
            if(boat.getX() == x && boat.getY() == y) {
                boat.setDestroyed(true);
            }
        }
        return "redirect:/game";
    }

    @GetMapping("/game")
    public String game(Model model) {
        return "game";
    }

}
