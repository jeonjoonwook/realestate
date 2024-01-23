package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AptInfoMapper {
    List<Apartment> selectAptInfo();

    List<Region> selectRegionInfo();

    List<Region> selectRegionDetailInfo(String rgnCd);
}
