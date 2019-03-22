package com.nf.pro_emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nf.pro_emp.dao")
public class ProEmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProEmpApplication.class, args);
    }

}
