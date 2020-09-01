package com.msr.msrshop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.msr.msrshop.member.dao")
@SpringBootApplication
public class MsrshopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsrshopMemberApplication.class, args);
    }

}
