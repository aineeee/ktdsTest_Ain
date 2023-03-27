package com.hello.attachfile.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hello.attachfile.service.AttachFileService;

public class AttachFileController {

	
	private AttachFileService attachFileService;
	
	@GetMapping("/file/download/{topicId}/{fileId}")
	public void downloadFile(@PathVariable int topicId
			     , @PathVariable long fileId) {		
		// TODO 파일 다운로드 		
	}
}
