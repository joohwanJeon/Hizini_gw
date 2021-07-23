package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.PostDTO;

public interface PostMapper {

	public List<PostDTO> selectPost();

}
