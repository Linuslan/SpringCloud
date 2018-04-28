package com.bst.gamesdk.controller;

import com.bst.gamesdk.model.SysCode;
import com.bst.gamesdk.service.ISysCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private ISysCodeService sysCodeService;
    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public String findOne() {
        SysCode sysCode = sysCodeService.findById();
        return sysCode.getCodeKey()+":"+sysCode.getCodeValue();
    }
}
