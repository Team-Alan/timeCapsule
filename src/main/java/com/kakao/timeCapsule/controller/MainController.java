package com.kakao.timeCapsule.controller;

import com.kakao.timeCapsule.domain.Content;
import com.kakao.timeCapsule.service.BottleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    private BottleService bottleService;

    @RequestMapping(value = "/")
    public String home() {
        return "home.html";
    }

    @RequestMapping(value = "/create")
    public String create() {
        return "create_page.html";
    }

    @RequestMapping(value = "/loading")
    public String loading(HttpServletRequest request, Model model) {
        model.addAttribute("id", request.getParameter("id"));
        return "loading.html";
    }

    @RequestMapping(value = "/createLoading")
    public String createLoading(HttpServletRequest request) {
        bottleService.insertContent(request.getParameter("text"));
        System.out.println(">>>>>>>>>>>>>>>>>내용 추가>>>>>>>>>>>>>>>>>>>>>>>");
        return "loading.html";
    }

    @RequestMapping(value="/read")
    public String read(HttpServletRequest request, Model model) {
        model.addAttribute("content", bottleService.getContent(Integer.parseInt(request.getParameter("id"))));
        return "read_page.html";
    }
}

