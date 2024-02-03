package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;
import com.joonwook.realestate.dto.AptDtlInfoDto;
import com.joonwook.realestate.dto.AptInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AptInfoMapper {
    List<Apartment> selectAptInfo(AptInfoDto aptInfoDto);

    List<AptDtlInfoDto> selectAptDtlInfo(AptDtlInfoDto aptDtlInfoDto);

    List<Region> selectRegionInfo();

    List<Region> selectRegionDetailInfo(String rgnCd);
}
