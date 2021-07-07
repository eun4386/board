package com.vanguardlab.dds.web.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vanguardlab.dds.web.bbs.dto.BoardDTO;
import com.vanguardlab.dds.web.bbs.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET, 
			produces="application/json", consumes = "application/json")
	public Object board() {
		List<BoardDTO> boardList = boardService.getBoardList();
		return boardList;
	}
	
	
	@RequestMapping(value="/getBoardDetail")
	public Object getBoardDetail(@RequestParam("no") int no) {
		BoardDTO board = boardService.getBoardDetail(no);
		System.out.println(board);
		return board;
	}
	
	
}
