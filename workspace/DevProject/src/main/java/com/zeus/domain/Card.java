package com.zeus.domain;

import java.time.LocalDate;
import java.time.YearMonth;

import lombok.Data;

@Data
public class Card {
	
	private String no;
	private YearMonth validMonth;
}
