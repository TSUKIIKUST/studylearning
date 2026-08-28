package com.tsuki.service.impl;

import com.tsuki.mapper.DeptMapper;
import com.tsuki.pojo.Dept;
import com.tsuki.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findALL() {
        return deptMapper.findAll();
    }
}
