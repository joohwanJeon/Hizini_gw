package com.hwanjin.hizini.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuizDTO {
	private String id;
	private String name;
	private String password;
	private String address;
	
	public QuizDTO(String id) {
		super();
		this.id = id;
	}
}