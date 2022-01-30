package com.hwanjin.hizini.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class MessageDTO<T> {
	private T data;
	private String returnCode;

	public MessageDTO(String returnCode) {
		super();
		this.returnCode = returnCode;
	}

	public MessageDTO(T data) {
		super();
		this.data = data;
	}	
}
