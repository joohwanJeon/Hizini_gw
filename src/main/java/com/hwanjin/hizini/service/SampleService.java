package com.hwanjin.hizini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwanjin.hizini.domain.dao.SampleMapper;
import com.hwanjin.hizini.domain.dto.SampleDTO;

@Service
public class SampleService {
	
	@Autowired 
	private SampleMapper sampleMapper;
	
	public List<SampleDTO> getSample(int sample) {
		return sampleMapper.selectSamples();
	}
	
	public SampleDTO getSample(SampleDTO sample) {
		return sampleMapper.selectSample(sample);
	}

}