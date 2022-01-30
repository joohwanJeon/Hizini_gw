package com.hwanjin.hizini.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SampleDTO {
	private String sampleString;
	private int sampleInt;
	
	public SampleDTO(String sampleString) {
		super();
		this.sampleString = sampleString;
	}
}
