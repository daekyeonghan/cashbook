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
public class Board {
	private int b_no;
	private String b_title;
	private String b_content;
	private String b_photo;
	private Date b_rdate;
	private String userid;
}
