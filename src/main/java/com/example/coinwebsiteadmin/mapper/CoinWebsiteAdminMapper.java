package com.example.coinwebsiteadmin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CoinWebsiteAdminMapper {
    public HashMap<String,String> selectLogin(HashMap<String, String> map);
    public int selectCntMember();
    public double selectAmountPayment();
    public int selectCntBuy();
    public int selectCntContact();
    public ArrayList<HashMap<String,Object>> selectMember();
    public ArrayList<HashMap<String,Object>> selectPayment();
    public ArrayList<HashMap<String,Object>> selectBuy();
    public ArrayList<HashMap<String,Object>> selectContact();
    public ArrayList<HashMap<String,Object>> selectSubscribe();
}
