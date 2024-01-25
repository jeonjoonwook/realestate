package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;
import com.joonwook.realestate.dto.AptInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AptInfoMapper {
    List<Apartment> selectAptInfo(AptInfoDto aptInfoDto);

    List<Region> selectRegionInfo();

    List<Region> selectRegionDetailInfo(String rgnCd);
}
