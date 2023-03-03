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
public class Cashbook {
	private int cb_id;
	private String cb_kind;
	private int cb_price;
	private String cb_content;
	private String cb_date;
	private Date cb_rdate;
	private String userid;
	private String c_name;
	
	
	public Cashbook(int cb_id, String cb_kind, int cb_price, String cb_content, String cb_date, String c_name) {
		super();
		this.cb_id = cb_id;
		this.cb_kind = cb_kind;
		this.cb_price = cb_price;
		this.cb_content = cb_content;
		this.cb_date = cb_date;
		this.c_name = c_name;
	}
	
	
}


