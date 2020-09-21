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
        PageQueryResult<Music> list = sw.buildQuery()
                .like("aartist",message)
                .doPageQuery(1,20,Music.class);
        if(list.getCount() > 0){
            return list.getResult();
        }
        return null;
    }
}
