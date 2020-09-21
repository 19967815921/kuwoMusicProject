package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Music> getAllMusic(Integer page){
        PageQueryResult<Music> list =  sw.buildQuery()
                .doPageQuery(page,20,Music.class);
        if(list.getCount() > 0){

            return list.getResult();
        }
        return null;
    }
}
