package com.zeus.domain;

import java.time.LocalDate;
import java.time.YearMonth;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Card {
	
	private String no;
	@DateTimeFormat(pattern = "yyyymm")
	private YearMonth validMonth;
}
