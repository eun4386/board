package com.vanguardlab.dds.web.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanguardlab.dds.web.bbs.dao.BoardDAO;
import com.vanguardlab.dds.web.bbs.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> getBoardList() {
		
		return boardDao.getBoardList();
	}
	
}
