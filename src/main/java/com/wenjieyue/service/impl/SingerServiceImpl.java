package com.wenjieyue.service.impl;

import com.wenjieyue.dao.SingerDAO;
import com.wenjieyue.pojo.Singer;
import com.wenjieyue.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerDAO singerDAO;

    @Override
    public List<Singer> getAllSinger(Integer page){
        return singerDAO.getAllSinger(page);
    }


}
