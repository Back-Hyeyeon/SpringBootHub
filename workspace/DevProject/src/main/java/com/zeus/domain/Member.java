package com.zeus.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Member {
	
	private String userId;
	private String password;
	private String userName;
	private String email;
	private LocalDate dateOfBirth;
	
	private Address address;
	private List<Card> cardList;
	private String[] hobbyArray;
	private String hobby;
	private List<String> hobbyList;
}
