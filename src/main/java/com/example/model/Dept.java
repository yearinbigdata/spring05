package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor	//필드생성
@NoArgsConstructor	//디폴트생성자
public class Dept {
	int deptno;
	String dname;
	String loc;
}
