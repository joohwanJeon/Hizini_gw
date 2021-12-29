package com.hwanjin.hizini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwanjin.hizini.domain.dao.QuizMapper;
import com.hwanjin.hizini.domain.dto.QuizDTO;

@Service
public class QuizService {

	@Autowired 
	private QuizMapper quizMapper;

	public List<QuizDTO> getData(String name) {
		return quizMapper.getData(name);
	}

}
