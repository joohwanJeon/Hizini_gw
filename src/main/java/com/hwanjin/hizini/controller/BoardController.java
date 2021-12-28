package com.hwanjin.hizini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hwanjin.hizini.domain.dto.BoardDTO;
import com.hwanjin.hizini.domain.dto.MessageDTO;
import com.hwanjin.hizini.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/getBoards", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<List<BoardDTO>>> getBoards() {
		List<BoardDTO> posts = boardService.getBoards();
		return ResponseEntity.ok(new MessageDTO<>(posts, "OK"));
	}
	
	@RequestMapping(value="/getBoard", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<BoardDTO>> getBoard(@RequestParam int id) {
		BoardDTO board = boardService.getBoard(id);
		return ResponseEntity.ok(new MessageDTO<>(board, "OK"));
	}

	@RequestMapping(value="/updateBoard", method=RequestMethod.POST)
	public ResponseEntity<MessageDTO<BoardDTO>> updateBoard(@RequestBody BoardDTO boardDTO) {
		BoardDTO board = boardService.updateBoard(boardDTO);
		return ResponseEntity.ok(new MessageDTO<>(board, "OK"));
	}
}
