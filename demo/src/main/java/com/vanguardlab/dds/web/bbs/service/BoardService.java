package com.vanguardlab.dds.web.bbs.service;

import java.util.List;

import com.vanguardlab.dds.web.bbs.dto.BoardDTO;

public interface BoardService {

	List<BoardDTO> getBoardList();

	BoardDTO getBoardDetail(int no);

}
