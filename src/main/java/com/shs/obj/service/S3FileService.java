package com.shs.obj.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S3FileService implements FileService {

    @Override
    public List<String> getFileList() {
        // 여기서 AWS S3 API를 호출해서 실제 파일 목록을 가져오면 됩니다.
        return null;// S3에서 가져온 파일 리스트;
    }
}
