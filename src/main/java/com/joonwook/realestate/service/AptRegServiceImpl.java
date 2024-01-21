package com.joonwook.realestate.service;

import com.joonwook.realestate.Mapper.AptRegMapper;
import com.joonwook.realestate.dto.AptRegDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AptRegServiceImpl implements AptRegService {

    @Autowired
    AptRegMapper aptRegMapper;

    @Override
    public void insertApt(AptRegDto aptRegDto) {
        try{
            aptRegMapper.insertApt(aptRegDto);
        }catch(Exception e){
            System.out.println("insertApt fail : "+e.getMessage());
        }
    }
}
