package com.kakao.timeCapsule.service;

import com.kakao.timeCapsule.domain.Bottle;
import com.kakao.timeCapsule.domain.Content;
import com.kakao.timeCapsule.mapper.BottleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleService {
    @Autowired
    private BottleMapper bottleMapper;

    Bottle getBottle(int bottle_id) {
        return bottleMapper.getBottle(bottle_id);
    }

    List<Content> getContents(int bottle_id) {
        return bottleMapper.getContents(bottle_id);
    }

    // 유리병 저장
    void saveBottle(Bottle bottle) {
        bottleMapper.saveBottle(bottle);
    }

    // content 저장
    void insertContent(Content content) {
        bottleMapper.insertContent(content);
    }
}
