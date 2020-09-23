package com.wenjieyue.service;

import com.wenjieyue.pojo.Album;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Mv;

import java.util.List;

public interface ClickEventService {

    List<Object> getAllSingerMessage(Integer id);

    List<Music> getAllMusicMessage(Integer id);

    List<Mv> getAllMvMessage(Integer id);

    List<Album> getAllAlbumMessage(Integer id);

}
