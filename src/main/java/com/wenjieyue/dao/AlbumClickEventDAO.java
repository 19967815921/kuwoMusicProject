package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.wenjieyue.pojo.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlbumClickEventDAO {


    @Autowired
    private MpaasQueryFactory sw;

    public List<Album> getAllAlbumMessage(Integer id){
        List<Album> list = sw.buildQuery()
                .eq("albumid",id)
                .doQuery(Album.class);
        if(list.size() > 0){
            return list;
        }
        return null;
    }
}
