package com.example.coinwebsiteadmin.index.service;

import com.example.coinwebsiteadmin.index.repository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class IndexService {

    @Autowired
    IndexRepository ir;

    public int selectCntMember() {
        return ir.selectCntMember();
    }

    public double selectAmountPayment() {
        return ir.selectAmountPayment();
    }

    public int selectCntBuy() {
        return ir.selectCntBuy();
    }

    public int selectCntContact() {
        return ir.selectCntContact();
    }
    public ArrayList<HashMap<String,Object>> selectMember() {
        return ir.selectMember();
    }
    public ArrayList<HashMap<String,Object>> selectPayment() {
        return ir.selectPayment();
    }
    public ArrayList<HashMap<String,Object>> selectBuy() {
        return ir.selectBuy();
    }
    public ArrayList<HashMap<String,Object>> selectContact() {
        return ir.selectContact();
    }
    public ArrayList<HashMap<String,Object>> selectSubscribe() {
        return ir.selectSubscribe();
    }
}
