package com.kakao.timeCapsule.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/")
    public String home() {
        return "main.html";
    }
}
