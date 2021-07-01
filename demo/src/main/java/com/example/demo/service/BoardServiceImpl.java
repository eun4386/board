package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDAO;
import com.example.demo.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardDAO boarddao;

	@Override
	public List<BoardDTO> getBoardList() {
		
		List<BoardDTO> boardList = boarddao.getBoardList();
		
		return boardList;
	}
	
}
