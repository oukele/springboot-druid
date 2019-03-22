package com.nf.pro_emp.service.impl;

import com.nf.pro_emp.dao.EmpMapper;
import com.nf.pro_emp.entity.Emp;
import com.nf.pro_emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OUKELE
 * @create 2019-03-22 9:02
 */

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> list() {
        return empMapper.selectAll();
    }
}
