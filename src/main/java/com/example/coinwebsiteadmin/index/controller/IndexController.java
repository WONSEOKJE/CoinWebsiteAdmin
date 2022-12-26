package com.example.coinwebsiteadmin.index.controller;

import com.example.coinwebsiteadmin.index.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"관리자서비스"}, description = "관리자 관련 서비스")
@RestController
public class IndexController {

    @Autowired
    IndexService is;

    @ApiOperation(value = "총 회원 수", notes = "총 회원 수를 조회한다")
    @GetMapping("/selectCntMember")
    public Integer selectCntMember() {
        return is.selectCntMember();
    }

    @ApiOperation(value = "총 포인트 판매량", notes = "총 포인트 판매량을 조회한다")
    @GetMapping("/selectAmountPayment")
    public Double selectAmountPayment() {
        return is.selectAmountPayment();
    }

    @ApiOperation(value = "총 코인 구매 건수", notes = "총 코인 구매 건수를 조회한다")
    @GetMapping("/selectCntBuy")
    public Integer selectCntBuy() {
        return is.selectCntBuy();
    }

    @ApiOperation(value = "총 연락 요청 건수", notes = "총 연락 요청 건수를 조회한다")
    @GetMapping("/selectCntContact")
    public Integer selectCntContact() {
        return is.selectCntContact();
    }

    @ApiOperation(value = "가입한 회원 목록 조회", notes = "가입한 회원 목록을 모두 조회한다")
    @GetMapping("/selectMember")
    public ArrayList<HashMap<String, Object>> selectMember() {
        return is.selectMember();
    }

    @ApiOperation(value = "회원 결제 목록 조회", notes = "회원의 결제 목록을 모두 조회한다")
    @GetMapping("/selectPayment")
    public ArrayList<HashMap<String,Object>> selectPayment() {
        return is.selectPayment();
    }

    @ApiOperation(value = "회원 코인 구매 목록 조회", notes = "회원의 코인 구매 목록을 모두 조회한다")
    @GetMapping("/selectBuy")
    public ArrayList<HashMap<String,Object>> selectBuy() {
        return is.selectBuy();
    }

    @ApiOperation(value = "연락 요청 조회", notes = "연락 요청 목록을 모두 조회한다")
    @GetMapping("/selectContact")
    public ArrayList<HashMap<String,Object>> selectContact() {
        return is.selectContact();
    }

    @ApiOperation(value = "구독 목록 조회", notes = "구독 목록을 모두 조회한다")
    @GetMapping("/selectSubscribe")
    public ArrayList<HashMap<String,Object>> selectSubscribe() {
        return is.selectSubscribe();
    }

}
