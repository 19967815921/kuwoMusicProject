package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Album;
import com.wenjieyue.pojo.Mv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchAlbumDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Album> getAlbumMessage(String message){
        PageQueryResult<Album> albumList = sw.buildQuery()
                .like("artist",message)
                .or()
                .like("album",message)
                .doPageQuery(1,20,Album.class);
        if(albumList.getCount() > 0){
            return albumList.getResult();
        }
        return null;
    }
}
