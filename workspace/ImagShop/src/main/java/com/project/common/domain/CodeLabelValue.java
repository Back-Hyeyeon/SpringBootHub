package com.project.common.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 공통 라벨 코드 클래스
@RequiredArgsConstructor 
@Getter
@Setter 
@ToString
public class CodeLabelValue {
	private final String value; 
	private final String label;
}
