package com.wenjieyue.service.impl;

import com.wenjieyue.dao.AlbumDAO;
import com.wenjieyue.pojo.Album;
import com.wenjieyue.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDAO albumDAO;

    @Override
    public List<Album> getAllAlbum(Integer page){
        return albumDAO.getAllAlbum(page);
    }
}
