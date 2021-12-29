package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.QuizDTO;

public interface QuizMapper {

	public List<QuizDTO> getData(String name);
}
