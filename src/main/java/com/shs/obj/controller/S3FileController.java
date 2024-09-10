package com.shs.obj.controller;

import com.shs.obj.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class S3FileController {

//    @Qualifier("s3FileService")
    private final FileService sampleFileService;

    @GetMapping("/s3files")
    public String showS3Files(Model model) {
        // 인터페이스를 통해 파일 목록을 가져옴
        model.addAttribute("files", sampleFileService.getFileList());
        return "s3filesView";
    }
}
