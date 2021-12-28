package com.hwanjin.hizini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwanjin.hizini.domain.dao.BoardMapper;
import com.hwanjin.hizini.domain.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired 
	private BoardMapper boardMapper;
		
	public List<BoardDTO> getBoards() {
		return boardMapper.selectBoards();
	}

	public BoardDTO getBoard(int id) {
		return boardMapper.selectBoard(id);
	}
}
