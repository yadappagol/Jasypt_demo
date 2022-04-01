package com.example.jasyptdemo.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerDto {
	private String customerName;
	private String customerPlace;
	private Long customerPhoneNumber;
	private String customerMailId;
	private LocalDate customerEnquiryDate;
	private String customerPassword;
}
