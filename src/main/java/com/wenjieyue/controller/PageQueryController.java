package com.wenjieyue.controller;

import com.wenjieyue.pojo.Album;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Mv;
import com.wenjieyue.pojo.Singer;
import com.wenjieyue.service.impl.AlbumServiceImpl;
import com.wenjieyue.service.impl.MusicServiceImpl;
import com.wenjieyue.service.impl.MvServiceImpl;
import com.wenjieyue.service.impl.SingerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 歌手，歌曲，mv以及专辑的分页查询接口
 */
@RestController
public class PageQueryController {

    @Autowired
    private MusicServiceImpl musicService;

    /**
     * 歌曲分页查询
     * @param page 页数
     * @return 歌曲信息集合
     */
    @RequestMapping("/music")
    public List<Music> getAllMusic(@RequestParam Integer page){
        return musicService.getAllMusic(page);
    }

    @Autowired
    private SingerServiceImpl singerService;

    /**
     * 歌手分页查询
     * @param page 页数
     * @return 歌手信息集合
     */
    @RequestMapping("/singer")
    public List<Singer> getAllSinger(@RequestParam Integer page){
        return singerService.getAllSinger(page);
    }

    @Autowired
    private MvServiceImpl mvService;

    /**
     * mv分页查询
     * @param page 页数
     * @return mv信息集合
     */
    @RequestMapping("/mv")
    public List<Mv> getAllMv(@RequestParam Integer page){
        return mvService.getAllMv(page);
    }

    @Autowired
    private AlbumServiceImpl albumService;

    /**
     * 专辑分页查询
     * @param page 页数
     * @return 专辑信息集合
     */
    @RequestMapping("/album")
    public List<Album> getAllAlbum(@RequestParam Integer page){
        return albumService.getAllAlbum(page);
    }
}
