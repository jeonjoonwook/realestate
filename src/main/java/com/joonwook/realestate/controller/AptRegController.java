package com.joonwook.realestate.controller;

import com.joonwook.realestate.dto.AptRegDto;
import com.joonwook.realestate.service.AptRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AptRegController {

    @Autowired
    AptRegService aptRegService;

    @GetMapping("/reg/apt")
    public String getAptInfo(Model model) {

        return "AptReg"; }

    @PostMapping("/save/apt")
    public String saveApt(AptRegDto aptRegDto) {
        aptRegService.insertApt(aptRegDto);
        return "redirect:/apt"; // 성공 페이지로 리다이렉션
    }
}
