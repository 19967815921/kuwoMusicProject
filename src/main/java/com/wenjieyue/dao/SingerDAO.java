package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SingerDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Singer> getAllSinger(Integer page){
        PageQueryResult<Singer> list =  sw.buildQuery()
                .doPageQuery(page,20,Singer.class);
        if(list.getCount() > 0){
            return list.getResult();
        }
        return null;
    }
}
