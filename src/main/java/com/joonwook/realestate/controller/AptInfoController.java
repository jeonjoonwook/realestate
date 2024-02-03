package com.joonwook.realestate.controller;
import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;
import com.joonwook.realestate.dto.AptDtlInfoDto;
import com.joonwook.realestate.dto.AptInfoDto;
import com.joonwook.realestate.service.AptInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AptInfoController {
    @Autowired
    AptInfoService aptInfoService;

    @GetMapping("/apt")
    public String getAptInfo(Model model) {
        List<Region> regions = aptInfoService.getRegionInfo();
        model.addAttribute("regions",regions);
        return "AptInfo"; }

    @GetMapping("/apt/dtl")
    public String getAptDtlInfo(Model model) {
        List<Region> regions = aptInfoService.getRegionInfo();
        model.addAttribute("regions",regions);
        return "AptDtlInfo"; }

    @PostMapping("/info/apt")
    public @ResponseBody List<Apartment> rtvAptInfo(@RequestBody AptInfoDto aptInfoDto) {
        List<Apartment> aptList =  aptInfoService.getAptInfo(aptInfoDto);
        return aptList; }

    @PostMapping("/info/apt/dtl")
    public @ResponseBody List<AptDtlInfoDto> rtvAptDtlInfo(@RequestBody AptDtlInfoDto aptDtlInfoDto) {

        List<AptDtlInfoDto> aptList =  aptInfoService.getAptDtlInfo(aptDtlInfoDto);
        return aptList; }

    @GetMapping("/region/detail")
    public @ResponseBody List<Region> rtvRegionDetailInfo(@RequestParam String rgnCd) {

        List<Region> regionDetailList =  aptInfoService.getRegionDetailInfo(rgnCd);

        return regionDetailList; }
}
