package com.vanguardlab.dds.web.bbs.dao;

import java.util.List;

import com.vanguardlab.dds.web.bbs.dto.BoardDTO;

public interface BoardDAO {

	List<BoardDTO> getBoardList();
	
	BoardDTO getBoardDetail(int no);

}
