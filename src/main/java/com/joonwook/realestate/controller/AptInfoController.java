package com.joonwook.realestate.controller;
import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.service.AptInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AptInfoController {
    @Autowired
    AptInfoService aptInfoService;

    @GetMapping("/apt")
    public String getAptInfo(Model model) {

        model.addAttribute("apartments",aptInfoService.getAptInfo());
        return "AptInfo"; }
}
