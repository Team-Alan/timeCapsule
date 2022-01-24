package com.kakao.timeCapsule.controller;

import com.kakao.timeCapsule.domain.Bottle;
import com.kakao.timeCapsule.domain.Content;
import com.kakao.timeCapsule.service.BottleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class ContentApiController {

    private final BottleService bottleService;

    /**
     * bottle 조회
     * @param bottle_id
     * @return
     */
    @GetMapping("/api/v1/bottle/{bottle_id}")
    @ResponseBody
    public List<Content> findByBottle(@PathVariable(required = false) int bottle_id) {
        return bottleService.getContents(bottle_id);
    }

    /**
     * bottle 등록
     * @return
     */
    @PostMapping("/api/v1/bottle")
    @ResponseBody
    public int addBottle() {
        Bottle bottle = new Bottle();
//        bottle.setId(bottleService.getMaxByBottles() + 1);
        bottleService.saveBottle(bottle);
        System.out.println(">>>>>>>>>>>>>>>>>병 추가 완료>>>>>>>>>>>>>>>>>>>>>>>");
        return bottle.getId();
    }


    /**
     * content 등록
     * @param content
     * @return
     */
    @PostMapping("/api/v1/content")
    @ResponseBody
    public int addContent(@PathVariable Content content) {
        bottleService.insertContent(content);
        System.out.println(">>>>>>>>>>>>>>>>>병에 내용 추가>>>>>>>>>>>>>>>>>>>>>>>");
        return content.getId();
    }
}
