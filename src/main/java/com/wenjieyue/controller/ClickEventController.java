package com.wenjieyue.controller;

import com.wenjieyue.pojo.Music;
import com.wenjieyue.service.impl.ClickEventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clickevent")
public class ClickEventController {

    @Autowired
    private ClickEventServiceImpl ClickEventService;

    @RequestMapping("/singer")
    public List<Object> getAllSingerMessage(Integer id){
        return ClickEventService.getAllSingerMessage(id);
    }

    @RequestMapping("/music")
    public List<Music> getAllMusicMessage(Integer id){
        return ClickEventService.getAllMusicMessage(id);
    }

    @RequestMapping("/mv")
    public List<Object> getAllMvMessage(Integer id){
        return ClickEventService.getAllMvMessage(id);
    }

    @RequestMapping("/album")
    public List<Object> getAllAlbumMessage(Integer id){
        return ClickEventService.getAllAlbumMessage(id);
    }

}
