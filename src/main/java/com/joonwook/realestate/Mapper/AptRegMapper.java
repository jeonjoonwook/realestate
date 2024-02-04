package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.dto.AptDtlRegDto;
import com.joonwook.realestate.dto.AptPrcRegDto;
import com.joonwook.realestate.dto.AptRegDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AptRegMapper {

    int insertApt(AptRegDto aptRegDto);

    int insertAptDtl(AptDtlRegDto aptDtlRegDto);

    int insertAptPrc(AptPrcRegDto aptPrcRegDto);
}
