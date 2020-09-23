package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Album;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Mv;
import com.wenjieyue.pojo.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SingerClickEventDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Object> getAllSingerMessage(Integer id){
        List<Object> list = new ArrayList<>();
        PageQueryResult<Singer> singerList =  sw.buildQuery()
                .eq("id",id)
                .doPageQuery(1,20,Singer.class);
        PageQueryResult<Music> musicList = sw.buildQuery()
                .eq("artistid",id)
                .doPageQuery(1,20,Music.class);
        PageQueryResult<Mv> mvList = sw.buildQuery()
                .eq("artistid",id)
                .doPageQuery(1,20,Mv.class);
        PageQueryResult<Album> albumList = sw.buildQuery()
                .eq("artistid",id)
                .doPageQuery(1,20,Album.class);
        list.add(singerList);
        list.add(musicList);
        list.add(mvList);
        list.add(albumList);
        return list;
    }


}
