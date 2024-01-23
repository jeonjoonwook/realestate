package com.joonwook.realestate.service;

import com.joonwook.realestate.Mapper.AptInfoMapper;
import com.joonwook.realestate.domain.Apartment;
import com.joonwook.realestate.domain.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AptInfoServiceImpl implements AptInfoService {

    @Autowired
    AptInfoMapper aptInfoMapper;

    @Override
    public List<Apartment> getAptInfo(){
        return aptInfoMapper.selectAptInfo();
    }

    @Override
    public List<Region> getRegionInfo() {
        return aptInfoMapper.selectRegionInfo();
    }

    @Override
    public List<Region> getRegionDetailInfo(String rgnCd) {
        return aptInfoMapper.selectRegionDetailInfo(rgnCd);
    }
}
