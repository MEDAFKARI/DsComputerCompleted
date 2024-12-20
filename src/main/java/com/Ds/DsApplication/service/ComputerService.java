package com.Ds.DsApplication.service;

import com.Ds.DsApplication.dtos.ComputerDto;

import java.util.List;

public interface ComputerService {

    public List<ComputerDto> getComputerByProce(String proce);


    public ComputerDto saveComputer(ComputerDto computerDto);


}
