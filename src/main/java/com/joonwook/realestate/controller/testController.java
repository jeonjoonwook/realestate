package com.joonwook.realestate.controller;
import com.joonwook.realestate.dto.Apartment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {

    @GetMapping("/")
    public String hello(Model model) {
        List<Apartment> apartments = new ArrayList<>();
        Apartment apartment1 = new Apartment("강남마을9단지한라비발디","2004", "890","110","84","54500","40000","N","41000","","27000","");
        apartments.add(apartment1);

        model.addAttribute("apartments",apartments);
        return "hello"; }
}
