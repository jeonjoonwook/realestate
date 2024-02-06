package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.dto.AptPrcInfoDto;
import com.joonwook.realestate.dto.AptPrcRegDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AptUdtMapper {

    int updateAptPrc(AptPrcRegDto aptPrcRegDto);
}
