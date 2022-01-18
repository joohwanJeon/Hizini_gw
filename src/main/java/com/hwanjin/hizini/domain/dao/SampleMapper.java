package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.SampleDTO;

public interface SampleMapper {
	
	public List<SampleDTO> selectSamples();

	public SampleDTO selectSample(SampleDTO sampleDTO);
	
	public int updateBoard(SampleDTO sampleDTO);
}
