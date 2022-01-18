package com.kakao.timeCapsule.mapper;

import com.kakao.timeCapsule.domain.Bottle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface bottleMapper {

    // 현재 id값 가져오기
    int getCurrentId();

    // 병 목록 RETURN
    List<Bottle> getPlanList();
}
