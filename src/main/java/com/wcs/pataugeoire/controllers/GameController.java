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
        int x = id/6 + 1;
        int y = id%6 + 1;
        System.out.println(id + " " + x + " " + y);
        for(Boat boat : (List<Boat>)(session.getAttribute("boats"))) {
            System.out.println(boat.getX() + " " + boat.getY() + " " + boat.isDestroyed());
        }
        for(Boat boat : (List<Boat>)(session.getAttribute("boats"))) {
            if(boat.getX() == x && boat.getY() == y) {
                boat.setDestroyed(true);
            }
        }
        if(session.getAttribute("boats2") == null) {
            List<Boat> boats2 = Arrays.asList(new Boat[]{
                // boat2 1
                new Boat(4, 1),
                new Boat(4, 2),
                new Boat(4, 3),
                // boat2 2
                new Boat(1, 1),
                // boat2 3
                new Boat(2, 5),
                new Boat(3, 5),
                new Boat(4, 5),
                // boat2 4
                new Boat(2, 2),
                new Boat(2, 3)
            });
            session.setAttribute("boats2", boats2);
        }
        int x1 = id/6 + 1;
        int y1 = id%6 + 1;
        System.out.println(id + " " + x1 + " " + y1);
        for(Boat boat2 : (List<Boat>)(session.getAttribute("boats2"))) {
            System.out.println(boat2.getX() + " " + boat2.getY() + " " + boat2.isDestroyed());
        }
        for(Boat boat2 : (List<Boat>)(session.getAttribute("boats2"))) {
            if(boat2.getX() == x1 && boat2.getY() == y1) {
                boat2.setDestroyed(true);
            }
        }
        return "redirect:/game";
    }

    @GetMapping("/game")
    public String game(Model model) {
        return "game";
    }

}
