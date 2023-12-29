package com.zeus.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Members {
	
	
	
	private String userId = "hong";
	private String password = "1234";
	private String userName = "혼진경";
	@DateTimeFormat(pattern = "yyyymmdd")
	private Date dateOfBorth;
	private int coin = 200;

}
