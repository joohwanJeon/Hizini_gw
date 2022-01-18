package com.hwanjin.hizini.domain.dto;

import lombok.Data;

@Data
public class SampleDTO {
	private String sampleString;
	private int sampleInt;
	
	public SampleDTO(String sampleString) {
		super();
		this.sampleString = sampleString;
	}
}
