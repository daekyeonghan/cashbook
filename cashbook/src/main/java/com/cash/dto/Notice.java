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
public class Notice {
	private int notice_no;
	private String notice_title;
	private String notice_content;
	private String notice_photo;
	private Date n_rdate;
	private String admin_id;
}
