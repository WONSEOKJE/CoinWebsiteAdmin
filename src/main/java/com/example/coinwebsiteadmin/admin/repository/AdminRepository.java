package com.example.coinwebsiteadmin.admin.repository;

import com.example.coinwebsiteadmin.mapper.CoinWebsiteAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class AdminRepository {

    @Autowired
    CoinWebsiteAdminMapper mapper;

    public HashMap<String,String> selectLogin(HashMap<String, String> map) {
        return mapper.selectLogin(map);
    }
}
