package com.shangy.sy.service.impl;

import com.shangy.sy.utils.EsReposiory;
import com.shangy.sy.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EsServiceImpl implements EsService {
    @Autowired
    private EsReposiory esReposiory;
    @Override
    public Object test() {
        return esReposiory.findAll();
    }
}
