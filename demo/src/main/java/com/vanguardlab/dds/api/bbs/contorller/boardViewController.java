package com.vanguardlab.dds.api.bbs.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardViewController {

	@RequestMapping("/")
	public String board() {
		return "list"; 
	}
	
	@RequestMapping("/boardDetail")
	public String boardDetail() {
		return "boardDetail";
	}
}