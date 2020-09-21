package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Mv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchMvDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Mv> getMvMessage(String message){
        PageQueryResult<Mv> mvList = sw.buildQuery()
                .like("artist",message)
                .or()
                .like("name",message)
                .doPageQuery(1,20,Mv.class);
        if(mvList.getCount() > 0){
            return mvList.getResult();
        }
        return null;
    }
}
