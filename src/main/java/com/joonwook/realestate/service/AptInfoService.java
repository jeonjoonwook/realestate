package com.joonwook.realestate.service;


import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;
import com.joonwook.realestate.dto.AptDtlInfoDto;
import com.joonwook.realestate.dto.AptInfoDto;
import com.joonwook.realestate.dto.AptPrcInfoDto;

import java.util.List;


public interface AptInfoService {
    List<Apartment> getAptInfo(AptInfoDto aptInfoDto);

    List<AptDtlInfoDto> getAptDtlInfo(AptDtlInfoDto aptDtlInfoDto);

    AptPrcInfoDto getAptPrcInfo(AptPrcInfoDto aptPrcInfoDto);

    List<Region> getRegionInfo();

    List<Region> getRegionDetailInfo(String rgnCd);
}
