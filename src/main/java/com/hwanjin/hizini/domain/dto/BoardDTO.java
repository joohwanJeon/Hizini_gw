package com.hwanjin.hizini.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardDTO {
	private int id;
	private String image;
	private String title;
	private String content;
}