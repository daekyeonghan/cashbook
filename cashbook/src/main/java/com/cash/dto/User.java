package com.cash.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
	private String userid;
	private String userpwd;
	private String username;
	private String birth;
	private String useremail;
	private Date rdate;
}
