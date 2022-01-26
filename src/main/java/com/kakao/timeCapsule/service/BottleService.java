package com.kakao.timeCapsule.service;

import com.kakao.timeCapsule.domain.Content;
import com.kakao.timeCapsule.mapper.BottleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BottleService {
    @Autowired
    private BottleMapper bottleMapper;

    public Content getContent(int bottle_id) {
        return bottleMapper.getContent(bottle_id);
    }

    // content 저장
    public void insertContent(String text) {
        int id = bottleMapper.getMaxIdByContent() + 1;
        Content content = new Content();
        content.setContent(text);
        content.setId(id);
        bottleMapper.insertContent(content);
    }
}
