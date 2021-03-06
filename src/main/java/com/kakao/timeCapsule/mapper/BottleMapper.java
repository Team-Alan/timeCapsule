package com.kakao.timeCapsule.mapper;

import com.kakao.timeCapsule.domain.Content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface BottleMapper {

    // 유리병에 있는 content 가져오기
    Content getContent(@Param("bottle_id") int bottle_id);

    // content 저장
    void insertContent(@Param("content") Content content);

    //maxId 값 가져오기
    int getMaxIdByContent();
}
