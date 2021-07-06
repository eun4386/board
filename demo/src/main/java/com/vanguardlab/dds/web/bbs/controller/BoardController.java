package com.vanguardlab.dds.web.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanguardlab.dds.web.bbs.dto.BoardDTO;
import com.vanguardlab.dds.web.bbs.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list")
	@ResponseBody
	public String board(Model model) {
		List<BoardDTO> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		System.out.println(boardList.get(0));
		return "list"; 
	}
	
}
