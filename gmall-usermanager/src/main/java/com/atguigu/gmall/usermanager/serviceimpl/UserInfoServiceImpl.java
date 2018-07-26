package com.atguigu.gmall.usermanager.serviceimpl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.itfac.UserInfoService;
import com.atguigu.gmall.usermanager.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> findAll(){
        return  userInfoMapper.selectAll();
    }
}
