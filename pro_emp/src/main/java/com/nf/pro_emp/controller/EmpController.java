package com.nf.pro_emp.controller;

import com.nf.pro_emp.entity.Emp;
import com.nf.pro_emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author OUKELE
 * @create 2019-03-22 9:03
 */

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping(path = "/list")
    public List<Emp> list(){
        return empService.list();
    }

}
