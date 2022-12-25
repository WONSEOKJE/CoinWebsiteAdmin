package com.example.coinwebsiteadmin.admin.service;

import com.example.coinwebsiteadmin.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class AdminService {

    @Autowired
    AdminRepository ar;

    public HashMap<String,String> selectLogin(HashMap<String, String> map) {
        return ar.selectLogin(map);
    }
}
