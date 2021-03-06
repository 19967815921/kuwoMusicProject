package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Singer;
import com.wenjieyue.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchMusicDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Music> getMusicMessage(String message){
        PageQueryResult<Music> musicList = sw.buildQuery()
                .like("artist",message)
                .or()
                .like("album",message)
                .or()
                .like("duration",message)
                .doPageQuery(1,20,Music.class);
        if(musicList.getCount() > 0){
            return musicList.getResult();
        }
        return null;
    }
}
