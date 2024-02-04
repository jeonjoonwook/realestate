package com.joonwook.realestate.controller;

import com.joonwook.realestate.domain.Region;
import com.joonwook.realestate.dto.AptDtlRegDto;
import com.joonwook.realestate.dto.AptPrcRegDto;
import com.joonwook.realestate.dto.AptRegDto;
import com.joonwook.realestate.service.AptInfoService;
import com.joonwook.realestate.service.AptRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AptRegController {
    @Autowired
    AptInfoService aptInfoService;
    @Autowired
    AptRegService aptRegService;

    @GetMapping("/reg/apt")
    public String regAptInfo(Model model) {
        List<Region> regions = aptInfoService.getRegionInfo();
        model.addAttribute("regions",regions);
        return "AptReg"; }

    @GetMapping("/reg/apt/dtl")
    public String regAptDtlInfo(@RequestParam(name = "aptId") String aptId , Model model) {
        model.addAttribute("aptId", aptId);
        return "AptDtlReg"; }

    @GetMapping("/reg/apt/prc")
    public String regAptPrcInfo(@RequestParam(name = "aptDtlId") String aptDtlId , Model model) {
        model.addAttribute("aptDtlId", aptDtlId);
        return "AptPrcReg"; }


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

    @PostMapping("/save/apt/dtl")
    public @ResponseBody Map<String,String> saveAptDtl(@RequestBody AptDtlRegDto aptDtlRegDto) {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Apt saved successfully.");

        try{
            aptRegService.insertAptDtl(aptDtlRegDto);
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

    @PostMapping("/save/apt/prc")
    public @ResponseBody Map<String,String> saveAptPrc(@RequestBody AptPrcRegDto aptPrcRegDto) {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Apt saved successfully.");

        try{
            aptRegService.insertAptPrc(aptPrcRegDto);
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
