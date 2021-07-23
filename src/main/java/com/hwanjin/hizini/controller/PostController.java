package com.hwanjin.hizini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hwanjin.hizini.domain.dao.PostMapper;
import com.hwanjin.hizini.domain.dto.PostDTO;

@RestController
public class PostController {
	@Autowired
	private PostMapper postMapper;
	
	@RequestMapping("/getPost")
	public List<PostDTO> getPost(@RequestParam(value="country", defaultValue = "")String country) {
		List<PostDTO> postList = postMapper.selectPost();
		return postList;  
	}
	
}
