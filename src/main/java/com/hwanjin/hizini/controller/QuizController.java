package com.hwanjin.hizini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hwanjin.hizini.domain.dto.MessageDTO;
import com.hwanjin.hizini.domain.dto.QuizDTO;
import com.hwanjin.hizini.service.QuizService;

@RestController
public class QuizController {
	
	@Autowired
	private QuizService quizService;

	@RequestMapping(value="/getData", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<List<QuizDTO>>> getBoard(@RequestParam @Nullable String name) {
		List<QuizDTO> user = quizService.getData(name);
		return ResponseEntity.ok(new MessageDTO<>(user, "OK"));
	}
}
