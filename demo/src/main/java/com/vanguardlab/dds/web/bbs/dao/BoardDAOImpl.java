package com.vanguardlab.dds.web.bbs.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vanguardlab.dds.web.bbs.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<BoardDTO> getBoardList() {
		return sqlsession.selectList("board.selectBoardList");
	}

}
