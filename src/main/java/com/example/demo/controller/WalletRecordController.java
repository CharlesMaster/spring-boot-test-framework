package com.example.demo.controller;


import com.example.demo.domain.dao.WalletRecordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WalletRecordController {

    @Autowired
    private WalletRecordDAO walletRecordDAO;

    @RequestMapping(path = {"/", "/wallet"})
    @ResponseBody
    public String index() {
        return "Hello " + walletRecordDAO.getByPrimary(1L).getOrderId();
    }
}
