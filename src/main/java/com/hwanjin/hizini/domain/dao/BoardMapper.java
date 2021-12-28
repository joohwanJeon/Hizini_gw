package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.BoardDTO;

public interface BoardMapper {
	
	public List<BoardDTO> selectBoards();

	public BoardDTO selectBoard(int id);
}
