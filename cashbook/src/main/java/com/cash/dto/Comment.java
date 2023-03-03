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
public class Comment {
	private int co_no;
	private String co_coment;
	private int b_no;
	private Date co_rdate;
	private String userid;
}
