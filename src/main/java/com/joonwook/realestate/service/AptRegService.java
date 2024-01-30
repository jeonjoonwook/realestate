package com.joonwook.realestate.service;

import com.joonwook.realestate.dto.AptDtlRegDto;
import com.joonwook.realestate.dto.AptRegDto;

public interface AptRegService {

    void insertApt(AptRegDto aptRegDto);

    void insertAptDtl(AptDtlRegDto aptDtlRegDto);
}
