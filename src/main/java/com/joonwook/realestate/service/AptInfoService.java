package com.joonwook.realestate.service;


import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;

import java.util.List;


public interface AptInfoService {
    List<Apartment> getAptInfo();

    List<Region> getRegionInfo();

    List<Region> getRegionDetailInfo(String rgnCd);
}
