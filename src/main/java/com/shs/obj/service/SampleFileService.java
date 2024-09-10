package com.shs.obj.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SampleFileService implements FileService {

    @Override
    public List<String> getFileList() {
        // 샘플 데이터 목록
        return Arrays.asList("sample1.txt", "sample2.txt", "sample3.txt");
    }
}
