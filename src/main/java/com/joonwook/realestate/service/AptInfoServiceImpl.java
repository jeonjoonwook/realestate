package com.joonwook.realestate.service;

import com.joonwook.realestate.Mapper.AptInfoMapper;
import com.joonwook.realestate.domain.Apartment;
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
}
