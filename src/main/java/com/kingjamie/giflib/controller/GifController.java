package com.kingjamie.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping("/gif")
    @ResponseBody
    public String listGifs(){
        return "List of all the Gifs";
    }
}