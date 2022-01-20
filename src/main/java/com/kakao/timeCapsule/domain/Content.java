package com.kakao.timeCapsule.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Content {
    private int id;
    private String content;
    private String uploadPath;
    private String fileName;
    private String write_date;
    private int bottle_id;
}
