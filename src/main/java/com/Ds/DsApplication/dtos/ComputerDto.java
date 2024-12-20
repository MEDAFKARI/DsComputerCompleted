package com.Ds.DsApplication.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComputerDto {
    private String proce;
    private int ram;
    private int hardDrive;
    private Double price;
    private String macAddress;
}
