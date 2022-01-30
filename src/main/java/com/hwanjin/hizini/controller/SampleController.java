package com.hwanjin.hizini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hwanjin.hizini.domain.dto.MessageDTO;
import com.hwanjin.hizini.domain.dto.SampleDTO;
import com.hwanjin.hizini.service.SampleService;

@RestController
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value="/getSample", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<List<SampleDTO>>> getSample(@RequestParam @Nullable String id) {
		List<SampleDTO> samples = sampleService.getSample();
		return ResponseEntity.ok(new MessageDTO<>(samples, "OK"));
	}
	
//	@RequestMapping(value="/deleteSample", method=RequestMethod.POST)
//	public ResponseEntity<MessageDTO<SampleDTO>> deleteSample(@RequestBody SampleDTO sampleDTO) {
//		SampleDTO sample = sampleService.getSample(sampleDTO);
//		return ResponseEntity.ok(new MessageDTO<SampleDTO>(sample, "OK"));
//	}
}
