package com.joonwook.realestate.Mapper;

import com.joonwook.realestate.dto.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    Test test();
}
