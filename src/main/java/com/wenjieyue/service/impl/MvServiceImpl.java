package com.wenjieyue.service.impl;

import com.wenjieyue.dao.MvDAO;
import com.wenjieyue.pojo.Mv;
import com.wenjieyue.service.MvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MvServiceImpl implements MvService {

    @Autowired
    private MvDAO mvDAO;

    @Override
    public List<Mv> getAllMv(Integer page){
        return mvDAO.getAllMv(page);
    }
}
