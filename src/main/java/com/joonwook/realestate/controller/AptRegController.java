package com.joonwook.realestate.controller;

import com.joonwook.realestate.dto.AptRegDto;
import com.joonwook.realestate.service.AptRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AptRegController {

    @Autowired
    AptRegService aptRegService;

    @GetMapping("/reg/apt")
    public String getAptInfo(Model model) {

        return "AptReg"; }

    @PostMapping("/save/apt")
    public @ResponseBody Map<String,String> saveApt(@RequestBody AptRegDto aptRegDto) {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Apt saved successfully.");

        try{
            aptRegService.insertApt(aptRegDto);
            response.put("status", "success");
            response.put("message", "Apt saved successfully.");
        }catch(Exception e){
            System.out.println("saveApt error");
            // 예외가 발생한 경우, 실패 상태를 response에 추가
            response.put("status", "error");
            response.put("message", "Failed to save Apt. " + e.getMessage());
        }

        return response;
    }
}
