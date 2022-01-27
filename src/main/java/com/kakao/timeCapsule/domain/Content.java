package com.kakao.timeCapsule.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Content {
    private int id;
    private String content;
    private String uploadPath;
    private String fileName;
    private int bottleId;
}