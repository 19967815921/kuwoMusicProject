package com.wenjieyue.service.impl;

import com.wenjieyue.dao.MusicDAO;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicDAO musicDAO;

    @Override
    public List<Music> getAllMusic(Integer page){
        return musicDAO.getAllMusic(page);
    }
}
