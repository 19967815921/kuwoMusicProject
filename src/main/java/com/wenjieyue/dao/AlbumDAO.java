package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlbumDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Album> getAllAlbum(Integer page){
        PageQueryResult<Album> list = sw.buildQuery()
                .doPageQuery(page,20,Album.class);
        if(list.getCount() > 0){
            return list.getResult();
        }
        return null;
    }
}
