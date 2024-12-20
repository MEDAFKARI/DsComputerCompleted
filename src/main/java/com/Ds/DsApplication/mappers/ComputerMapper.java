package com.Ds.DsApplication.mappers;


import com.Ds.DsApplication.dao.entity.Computer;
import com.Ds.DsApplication.dtos.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ComputerMapper {

    private final ModelMapper modelMapper = new ModelMapper();



    public ComputerDto fromComputerToComputerDTO(Computer computer){

       return modelMapper.map(computer, ComputerDto.class);

    }

    public Computer fromComputerDTOToComputer(ComputerDto computer){

        return modelMapper.map(computer, Computer.class);
    }




}
