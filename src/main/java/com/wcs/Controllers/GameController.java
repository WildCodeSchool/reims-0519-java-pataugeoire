package com.wcs.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;

@Controller
public class GameController{

    private static Game game = Game.getGame();
    
    @GetMapping ("/game")
        public String getGrid(){
           
        }
    }
