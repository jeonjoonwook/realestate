package com.joonwook.realestate.service;

import com.joonwook.realestate.Mapper.TestMapper;
import com.joonwook.realestate.dto.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public Test test() {
        return testMapper.test();
    }
}
