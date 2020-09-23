package com.wenjieyue.dao;

import com.definesys.mpaas.query.MpaasQueryFactory;
import com.wenjieyue.pojo.Music;
import com.wenjieyue.pojo.Mv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MvClickEventDAO {

    @Autowired
    private MpaasQueryFactory sw;

    public List<Mv> getAllMvMessage(Integer id){
        List<Mv> list = sw.buildQuery()
                .select("mvplaycnt")
                .eq("id",id)
                .doQuery(Mv.class);
        if(list.size() > 0){
            return list;
        }
        return null;
    }
}
