package com.example.coinwebsiteadmin.page.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

@Api(tags = {"페이지이동"}, description = "페이지 이동 관련 서비스")
@Controller
public class PageController {

    @ApiOperation(value = "기본 페이지", notes = "기본 페이지로 이동한다")
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @ApiOperation(value = "로그인 페이지", notes = "로그인 페이지로 이동한다, 하지만 세션이 존재한다면 기본 페이지로 이동한다")
    @GetMapping("/")
    public String login(@ApiIgnore HttpSession session) {
        if (session.getAttribute("id") != null) {
            return "index";
        }
        return "login";
    }

    @ApiOperation(value = "회원 목록 조회 페이지", notes = "회원 목록 조회 페이지로 이동한다")
    @GetMapping("/goMember")
    public String goMember() {
        return "memberList";
    }

    @ApiOperation(value = "결제 목록 조회 페이지", notes = "결제 목록 조회 페이지로 이동한다")
    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @ApiOperation(value = "코인 구매 목록 조회 페이지", notes = "코인 구매 목록 조회 페이지로 이동한다")
    @GetMapping("/goBuy")
    public String goBuy() {
        return "buyList";
    }

    @ApiOperation(value = "연락 요청 목록 조회 페이지", notes = "연락 요청 목록 조회 페이지로 이동한다")
    @GetMapping("/goContact")
    public String goContact() {
        return "contactList";
    }

    @ApiOperation(value = "구독 목록 조회 페이지", notes = "구독 목록 조회 페이지로 이동한다")
    @GetMapping("/goSubscribe")
    public String goSubscribe() {
        return "subscribeList";
    }


}
