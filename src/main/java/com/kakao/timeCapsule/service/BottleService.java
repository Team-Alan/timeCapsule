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

    public Bottle getBottle(int bottle_id) {
        return bottleMapper.getBottle(bottle_id);
    }

    public List<Content> getContents(int bottle_id) {
        return bottleMapper.getContents(bottle_id);
    }

    // 유리병 저장
    public void saveBottle(Bottle bottle) {
        bottleMapper.saveBottle(bottle);
    }

    // content 저장
    public void insertContent(Content content) {
        bottleMapper.insertContent(content);
    }

    // maxId 가져오기
    public int getMaxByBottles() {
        return bottleMapper.getMaxIdByBottles();
    }

    public int getMaxByContents() {
        return bottleMapper.getMaxIdByContents();
    }
}
