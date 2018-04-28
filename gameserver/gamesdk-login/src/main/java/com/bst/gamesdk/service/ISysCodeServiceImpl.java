package com.bst.gamesdk.service;

import com.bst.gamesdk.mapper.SysCodeMapper;
import com.bst.gamesdk.model.SysCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("sysCodeService")
public class ISysCodeServiceImpl implements ISysCodeService {
    @Autowired
    SysCodeMapper sysCodeMapper;
    @Override
    public SysCode findById() {
        return sysCodeMapper.findOne();
    }
}
