package com.joonwook.realestate.service;

import com.joonwook.realestate.Mapper.AptUdtMapper;
import com.joonwook.realestate.dto.AptPrcInfoDto;
import com.joonwook.realestate.dto.AptPrcRegDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptUdtServiceImpl implements AptUdtService{

    @Autowired
    AptUdtMapper aptUdtMapper;
    @Override
    public void updateAptPrc(AptPrcRegDto aptPrcRegDto) {
        try{
            aptUdtMapper.updateAptPrc(aptPrcRegDto);
        }catch(Exception e){
            System.out.println("updateAptPrc fail : "+e.getMessage());
        }
    }
}
