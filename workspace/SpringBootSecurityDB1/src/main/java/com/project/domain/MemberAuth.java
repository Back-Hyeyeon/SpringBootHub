package com.project.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberAuth implements Serializable {
	private static final long serialVersionUID = 4948993673467321353L;
	//FK
	private int userNo;
	private String auth;

}
