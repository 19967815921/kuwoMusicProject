package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.wenjieyue.pojo.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicClickEventDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Music> getAllMusicMessage(Integer id){
        List<Music> list = sw.buildQuery()
                .select("musicid")
                .eq("id",id)
                .doQuery(Music.class);
        if(list.size() > 0){
            return list;
        }
        return null;
    }
}
