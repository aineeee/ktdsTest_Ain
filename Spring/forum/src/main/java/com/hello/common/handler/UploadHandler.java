package com.hello.common.handler;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.hello.attachfile.service.AttachFileService;
import com.hello.attachfile.vo.AttachFileVO;

@Component
public class UploadHandler {
	
	@Value("${upload.path}")
	private String uploadPath;
	
	private AttachFileService attachFileService;
	
	public void upload(List<MultipartFile> multipartFileList, int topicId) {
		for(MultipartFile multipartFile : multipartFileList) {
			upload(multipartFile, topicId);
		}
	}

	public void upload(MultipartFile multipartFile, int topicId) {

		// 파일 업로드 처리
		// 파일을 업로드 했는지 확인
		if (multipartFile != null && !multipartFile.isEmpty()) {

			// 난수파일명 생성
			// UUID = 현재 시간(MilliSeconds)을 기반으로 난수를 생성한다.
			// 중복이 절대 발생하지 않는다.
			String uuidFileName = UUID.randomUUID().toString();
			// 진짜 파일명 가져오기
			String originFileName = multipartFile.getOriginalFilename();

			// 파일이 저장될 위치 가져오기
			File uploadPath = new File(this.uploadPath);

			// 폴더가 존재하는지 확인
			if (!uploadPath.exists()) {
				// 폴더가 없다면 생성한다.
				uploadPath.mkdir();
			}

			// 업로드 파일명을 randomFileName으로 변경한다.
			File randomNameFile = new File(uploadPath, uuidFileName);

			// uploadPath에 업로드된 파일을 이동시키기
			try {
				multipartFile.transferTo(randomNameFile);
			} catch (IllegalStateException | IOException e) {
				throw new RuntimeException("파일을 업로드 할 수 없습니다!");
			}
			
			AttachFileVO attachFileVO = new AttachFileVO();
			attachFileVO.setTopicId(topicId);
			attachFileVO.setOriginFileName(originFileName);
			attachFileVO.setUuidFileName(uuidFileName);
			attachFileVO.setFileSize(multipartFile.getSize());
			
			String ext = originFileName.substring(originFileName.lastIndexOf(".") + 1);
			attachFileVO.setFileExt(ext);
			
			attachFileService.createAttachFile(attachFileVO);
			
			// topicVO에 업로드 파일을 세팅한다.
			//abstractVO.setFileName(uuidFileName); // 난수화된 파일의 이름
			//abstractVO.setOriginFileName(originFileName); // 업로드된 실제 파일의 이름
		}

	}	

}
