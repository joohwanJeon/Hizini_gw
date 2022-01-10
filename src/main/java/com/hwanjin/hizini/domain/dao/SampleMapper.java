package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.BoardDTO;

public interface SampleMapper {
	
	public List<BoardDTO> selectBoards();

	public BoardDTO selectBoard(int id);
	
	public int updateBoard(BoardDTO board);
}
