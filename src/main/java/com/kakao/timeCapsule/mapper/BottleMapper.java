package com.kakao.timeCapsule.mapper;

import com.kakao.timeCapsule.domain.Bottle;
import com.kakao.timeCapsule.domain.Content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface BottleMapper {
    // 유리병 가져오기
    Bottle getBottle(@Param("bottle_id") int bottle_id);

    // 유리병에 있는 content 가져오기
    List<Content> getContents(@Param("bottle_id") int bottle_id);

    // 유리병 저장
    void saveBottle(@Param("bottle") Bottle bottle);

    // content 저장
    void insertContent(@Param("content") Content content);

    //maxId 값 가져오기
    int getMaxIdByBottles();
    int getMaxIdByContents();
}
