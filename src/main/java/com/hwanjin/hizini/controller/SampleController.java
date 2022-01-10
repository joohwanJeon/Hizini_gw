package com.hwanjin.hizini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hwanjin.hizini.domain.dto.BoardDTO;
import com.hwanjin.hizini.domain.dto.MessageDTO;
import com.hwanjin.hizini.service.BoardService;

@RestController
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value="/getSample", method=RequestMethod.GET)
	public ResponseEntity<MessageDTO<List<SampleDTO>>> getSample(@RequestParam @Nullable int id) {
		List<SampleDTO> samples = sampleService.getSample();
		return ResponseEntity.ok(new MessageDTO<>(samples, "OK"));
	}
	
	@RequestMapping(value="/deleteSample", method=RequestMethod.POST)
	public ResponseEntity<MessageDTO<SampleDTO>> deleteSample(@RequestBody SampleDTO id) {
		SampleDTP sample = sampleService.deleteSample(id);
		return ResponseEntity.ok(new MessageDTO<>(sample, "OK"));
	}

	@RequestMapping(value="/updateSample", method=RequestMethod.POST)
	public ResponseEntity<MessageDTO<SampleDTO>> updateSample(@RequestBody SampleDTO sampleDTO) {
		SampleDTO sample = sampleService.updateSample(sampleDTO);
		return ResponseEntity.ok(new MessageDTO<>(sample, "OK"));
	}
}
