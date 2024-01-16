package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.domain.Apartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AptInfoMapper {
    List<Apartment> selectAptInfo();
}
