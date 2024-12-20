package com.Ds.DsApplication.controller;

import com.Ds.DsApplication.dao.entity.Computer;
import com.Ds.DsApplication.dtos.ComputerDto;
import com.Ds.DsApplication.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {

    @Autowired
    private ComputerService computerService;

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce) {
        System.out.println(proce);
        return computerService.getComputerByProce(proce);
    }



    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computer) {
        return computerService.saveComputer(computer);
    }

}
