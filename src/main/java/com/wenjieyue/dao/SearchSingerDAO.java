package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchSingerDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Singer> getSingerMessage(String message){
        PageQueryResult<Singer> list = sw.buildQuery()
                .like("aartist",message)
                .doPageQuery(1,20,Singer.class);
        if(list.getCount() > 0){
            return list.getResult();
        }
        return null;
    }
}
