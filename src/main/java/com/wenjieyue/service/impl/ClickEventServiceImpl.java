package com.wenjieyue.service.impl;

import com.wenjieyue.dao.AlbumClickEventDAO;
import com.wenjieyue.dao.MusicClickEventDAO;
import com.wenjieyue.dao.MvClickEventDAO;
import com.wenjieyue.dao.SingerClickEventDAO;
import com.wenjieyue.pojo.Album;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Mv;
import com.wenjieyue.service.ClickEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClickEventServiceImpl implements ClickEventService {

    @Autowired
    private SingerClickEventDAO singerClickEventDAO;

    @Autowired
    private MusicClickEventDAO musicClickEventDAO;

    @Autowired
    private MvClickEventDAO mvClickEventDAO;

    @Autowired
    private AlbumClickEventDAO albumClickEventDAO;

    @Override
    public List<Object> getAllSingerMessage(Integer id) {
        return singerClickEventDAO.getAllSingerMessage(id);
    }

    @Override
    public List<Music> getAllMusicMessage(Integer id) {
        return musicClickEventDAO.getAllMusicMessage(id);
    }

    @Override
    public List<Mv> getAllMvMessage(Integer id) {
        return mvClickEventDAO.getAllMvMessage(id);
    }

    @Override
    public List<Album> getAllAlbumMessage(Integer id) {
        return albumClickEventDAO.getAllAlbumMessage(id);
    }
}
