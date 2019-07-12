package com.wcs.pataugeoire.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    public String attack(@RequestParam int cellIndex, HttpSession session) {
        int x = cellIndex%6;
        int y = cellIndex/6;
        session.setAttribute("attackCount", (Integer)(session.getAttribute("attackCount")) + 1);
        System.out.println(cellIndex + " " + x + " " + y);
        List<Boolean> grid = (List<Boolean>)(session.getAttribute("grid"));
        for(Boat boat : (List<Boat>)(session.getAttribute("boats"))) {
           if(boat.getX() == (x+1) && boat.getY() == (y+1)) {
                boat.setDestroyed(true);
                
            }
        }
        boolean won = true;
        for(Boat boat : (List<Boat>)(session.getAttribute("boats"))) {
            won = won && boat.isDestroyed();
        }
        grid.set(cellIndex, true);

        if(won) {
            return "redirect:/end";
        }
        else {
            return "redirect:/game";
        }
    }

    @GetMapping("/game")
    public String game(Model model, HttpSession session) {
        int gridSize = 6;
        if(session.getAttribute("attackCount") == null) {
            session.setAttribute("attackCount", 0);
        }
        if(session.getAttribute("grid") == null) {
            Boolean[] wasAttacked = new Boolean[gridSize*gridSize];
            Arrays.fill(wasAttacked, false);
            List<Boolean> grid = Arrays.asList(wasAttacked);
            session.setAttribute("grid", grid);
        }
        if(session.getAttribute("boats") == null) {
            List<Integer> xValues = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
            List<Integer> yValues = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
            Collections.shuffle(xValues);
            Collections.shuffle(yValues);
            List<Boat> boats = new ArrayList<Boat>();
            for(int i = 0; i < xValues.size(); i++) {
                boats.add(new Boat(xValues.get(i), yValues.get(i)));
            }
            session.setAttribute("boats", boats);
        }
        model.addAttribute("grid", session.getAttribute("grid"));
        model.addAttribute("boats", session.getAttribute("boats"));
        return "game";
    }

}
