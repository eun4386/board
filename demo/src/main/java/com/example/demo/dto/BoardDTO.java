package com.example.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
	
	private int no;
	private String title;
	private String content;
	private String writer;
	private String password;
	private Date reg_date;
	
}
