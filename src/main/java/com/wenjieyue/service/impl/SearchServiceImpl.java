package com.wenjieyue.service.impl;

import com.wenjieyue.dao.SearchMusicDAO;
import com.wenjieyue.dao.SearchSingerDAO;
import com.wenjieyue.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchSingerDAO searchSingerDAO;
    @Autowired
    private SearchMusicDAO searchMusicDAO;
    @Autowired
    private SearchMvDAO searchMvDAO;
    @Autowired
    private SearchAlbumDAO searchAlbumDAO;

    @Override
    public List<Object> getAllMessage(String message) {
        List<Object> list = new ArrayList<>();
        list.addAll(searchSingerDAO.getSingerMessage(message));
        list.addAll(searchMusicDAO.getMusicMessage(message));
        list.addAll(searchMvDAO.getMvMessage(message));
        list.addAll(searchAlbumDAO.getAlbumMessage(message));
        return list;
    }
}
