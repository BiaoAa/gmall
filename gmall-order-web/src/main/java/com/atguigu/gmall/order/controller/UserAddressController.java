package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.itfac.UserAddressService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAddressController {

    @Reference
    private UserAddressService userAddressService;

    @ResponseBody
    @RequestMapping("getAddress")
    public List<UserAddress>  getAddress(HttpServletRequest request){
        String userId = request.getParameter("userId");
        List<UserAddress> userAddresses = userAddressService.queryAddress(userId);
        return userAddresses;
    }
}
