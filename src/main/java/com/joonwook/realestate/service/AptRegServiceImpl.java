package com.joonwook.realestate.service;

import com.joonwook.realestate.Mapper.AptRegMapper;
import com.joonwook.realestate.dto.AptDtlRegDto;
import com.joonwook.realestate.dto.AptPrcInfoDto;
import com.joonwook.realestate.dto.AptPrcRegDto;
import com.joonwook.realestate.dto.AptRegDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AptRegServiceImpl implements AptRegService {

    @Autowired
    AptRegMapper aptRegMapper;

    @Autowired
    AptInfoService aptInfoService;

    @Autowired
    AptUdtService aptUdtService;

    @Override
    public void insertApt(AptRegDto aptRegDto) {
        try{
            aptRegMapper.insertApt(aptRegDto);
        }catch(Exception e){
            System.out.println("insertApt fail : "+e.getMessage());
        }
    }

    @Override
    public void insertAptDtl(AptDtlRegDto aptDtlRegDto) {
        try{
            aptRegMapper.insertAptDtl(aptDtlRegDto);
        }catch(Exception e){
            System.out.println("insertAptDtl fail : "+e.getMessage());
        }
    }

    @Override
    public void insertAptPrc(AptPrcRegDto aptPrcRegDto) {
        try{
            AptPrcInfoDto reqInfo = new AptPrcInfoDto();
            reqInfo.setAptDtlId(aptPrcRegDto.getAptDtlId());
            reqInfo.setPrcTypeCd(aptPrcRegDto.getPrcTypeCd());
            reqInfo.setDealTypeCd(aptPrcRegDto.getDealTypeCd());

            AptPrcInfoDto resultInfo = aptInfoService.getAptPrcInfo(reqInfo);
            if(resultInfo!=null){
                AptPrcRegDto udtDto = new AptPrcRegDto();
                udtDto.setAptDtlId(aptPrcRegDto.getAptDtlId());
                udtDto.setPrcTypeCd(aptPrcRegDto.getPrcTypeCd());
                udtDto.setDealTypeCd(aptPrcRegDto.getDealTypeCd());
                aptUdtService.updateAptPrc(udtDto);
            }

            aptRegMapper.insertAptPrc(aptPrcRegDto);
        }catch(Exception e){
            System.out.println("insertAptPrc fail : "+e.getMessage());
        }
    }
}
