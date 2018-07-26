package com.atguigu.gmall.itfac;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface UserAddressService {
    public List<UserAddress> queryAddress(String userId);
}
