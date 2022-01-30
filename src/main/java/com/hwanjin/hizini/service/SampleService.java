package com.hwanjin.hizini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwanjin.hizini.domain.dao.SampleMapper;
import com.hwanjin.hizini.domain.dto.SampleDTO;
import com.hwanjin.hizini.exception.BizException;

@Service
public class SampleService {
	
	
	@Autowired 
	private SampleMapper sampleMapper;
	
	@Transactional
	public List<SampleDTO> getSample() {
		List<SampleDTO> list = new ArrayList<SampleDTO>();
		SampleDTO test = new SampleDTO("abc", 1);
		SampleDTO test2 = new SampleDTO("abc", 2);
		list.add(test);
		list.add(test2);
		if(!list.isEmpty()) {
			
			throws new BizException("test");
		}
		return list;
	}
}