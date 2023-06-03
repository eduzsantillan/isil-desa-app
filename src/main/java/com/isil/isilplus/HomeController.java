package com.isil.isilplus;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("edad",17);
        return "index";
    }

    @GetMapping("/otro")
    public String otro(Model model){
        model.addAttribute("name","Eduardo");
        return "otro";
    }




}
