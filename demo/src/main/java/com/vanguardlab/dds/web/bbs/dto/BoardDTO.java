package com.vanguardlab.dds.web.bbs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BoardDTO {
	
	private int no;
	private String title;
	private String content;
	private String writer;
	
}
