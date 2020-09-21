package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import com.wenjieyue.pojo.Mv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MvDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Mv> getAllMv(Integer page){
        PageQueryResult<Mv> list = sw.buildQuery()
                .doPageQuery(page,20,Mv.class);
        if(list.getCount() > 0){
            return list.getResult();
        }
        return null;
    }

}
