package com.example.coinwebsiteadmin.admin.controller;

import com.example.coinwebsiteadmin.admin.service.AdminService;
import com.example.coinwebsiteadmin.dto.AdminDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Api(tags = {"관리자로그인"}, description = "관리자 로그인 및 로그아웃 서비스")
@Controller
public class AdminController {
    @Autowired
    AdminService as;

    @PostMapping("/login")
    @ApiOperation(value = "사용자별 인증 정보 CHECK", notes = "인증된 사용자인지 판단하는 API입니다.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
    })
    public String login(AdminDTO adminDTO, @ApiIgnore HttpSession session){
        HashMap<String,String> map = new HashMap<>();
        map.put("id", adminDTO.getId());
        map.put("password", adminDTO.getPassword());

        if (as.selectLogin(map) != null) {
                session.setAttribute("id", map.get("id"));
                return "index";
        }

        return "login";
    }


    @ApiOperation(value = "로그아웃", notes = "로그아웃을 수행하고 세션을 만료시킵니다.")
    @GetMapping("/logout")
    public String logout(@ApiIgnore HttpSession session) {
        session.invalidate();
        return "login";
    }
}
