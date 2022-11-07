package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MustacheController {
    @GetMapping(value = "/hi")
    public String mustacheCon(Model model){
        model.addAttribute("username","ahn");
        return "greetings";
    }
}
