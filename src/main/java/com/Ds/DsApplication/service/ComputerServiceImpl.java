package com.Ds.DsApplication.service;


import com.Ds.DsApplication.dao.entity.Computer;
import com.Ds.DsApplication.dao.repository.ComputerRepository;
import com.Ds.DsApplication.dtos.ComputerDto;
import com.Ds.DsApplication.mappers.ComputerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ComputerServiceImpl implements ComputerService{


    private final ComputerRepository computerRepository;


    private final ComputerMapper computerMapper;


    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        System.out.println(proce);
        List<Computer> computers= computerRepository.findByProce(proce);
        System.out.println(computers);
        List<ComputerDto> computersDto =computers.stream().map(m -> {
            return  computerMapper.fromComputerToComputerDTO(m);
        }).collect(Collectors.toList());
        return computersDto;
    }

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
       Computer computer = computerRepository.save(computerMapper.fromComputerDTOToComputer(computerDto));

        return computerMapper.fromComputerToComputerDTO(computer);
    }
}
