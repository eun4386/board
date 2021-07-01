package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardservice;
	
	@RequestMapping("/list")
	public String BoardList(Model model, HttpServletRequest reuqest) {
		
		List<BoardDTO> boardList = new ArrayList<>();
		// boardList = boardservice.getBoardList();
		
 		
		return "asdf";
	}
	
}
